package domain.model;
import java.util.HashMap;

public class Section {

	private int sectionNo;//课程安排号
	private char dayOfWeek;//周几
	private String timeOfDay;//啥时候
	private String room;//教室
	private int seatingCapacity;//座位容量
	private Course representedCourse;//课程
	private ScheduleOfClasses offeredIn;//班级目录，学期
	private Professor instructor;//教师
	private HashMap<String, Student> enrolledStudents; 
	private HashMap<Student, TranscriptEntry> assignedGrades; //学生成绩
	
	public Section(int sNo, char day, String time, Course course,
		       String room, int capacity) {
		setSectionNo(sNo);
		setDayOfWeek(day);
		setTimeOfDay(time);
		setRepresentedCourse(course);
		setRoom(room);
		setSeatingCapacity(capacity);
		setInstructor(null);
		enrolledStudents = new HashMap<String, Student>();
		assignedGrades = new HashMap<Student, TranscriptEntry>();
	}
	
	public void setSectionNo(int no) {
		sectionNo = no;
	}
	
	public int getSectionNo() {
		return sectionNo;
	}
	
	public void setDayOfWeek(char day) {
		dayOfWeek = day;
	}
	
	public char getDayOfWeek() {
		return dayOfWeek;
	}
		
	public void setTimeOfDay(String time) {
		timeOfDay = time;
	}
	
	public String getTimeOfDay() {
		return timeOfDay;
	}

	public void setInstructor(Professor prof) {
		instructor = prof;
	}
	
	public Professor getInstructor() {
		return instructor;
	}
	
	public void setRepresentedCourse(Course c) {
		representedCourse = c;
	}
	
	public Course getRepresentedCourse() {
		return representedCourse;
	}		

	public void setRoom(String r) {
		room = r;
	}

	public String getRoom() {
		return room;
	}

	public void setSeatingCapacity(int c) {
		seatingCapacity = c;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setOfferedIn(ScheduleOfClasses soc) {
		offeredIn = soc;
	}

	public ScheduleOfClasses getOfferedIn() {
		return offeredIn;
	}	
	@Override
	public String toString() {
		return getRepresentedCourse().getCourseNo() + " - " +
		       getSectionNo() + " - " +
		       getDayOfWeek() + " - " +
		       getTimeOfDay();
	}
	//获取所有课程安排的课程编号
	public String getFullSectionNo() {
		return getRepresentedCourse().getCourseNo() + 
		       " - " + getSectionNo();
	}
	//获取上课信息
	public String getFullSectionInfo() {
		return getRepresentedCourse().getCourseName() + 
			   "-" + getDayOfWeek() + "-" +
		       "" + getTimeOfDay() +
		       "-" + this.getRoom();
	}
	public EnrollmentStatus enroll(Student s) {
		Transcript transcript = s.getTranscript();
//判断是否登记过
		if (s.isCurrentlyEnrolledInSimilar(this) || 
		    transcript.verifyCompletion(this.getRepresentedCourse())) {
			return EnrollmentStatus.prevEnroll;
		}
		Course c = this.getRepresentedCourse();
		//判断是否满足先修
		if (c.hasPrerequisites()) {
			for (Course pre : c.getPrerequisites()) {
				if (!transcript.verifyCompletion(pre)) {
					return EnrollmentStatus.prereq;
				}
			}
		}
		//判断课程是否满选
		if (!this.confirmSeatAvailability()) {
			return EnrollmentStatus.secFull;
		}
		enrolledStudents.put(s.getSsn(), s);
		s.addSection(this);

		return EnrollmentStatus.success;
	}
	
	// A private "housekeeping" method.

	private boolean confirmSeatAvailability() {
		if (enrolledStudents.size() < getSeatingCapacity()) return true;
		else return false;
	}
//如果登记过了，就删除
	public boolean drop(Student s) {
		if (!s.isEnrolledIn(this)) return false;
		else {
			enrolledStudents.remove(s.getSsn());
			s.dropSection(this);
			return true;
		}
	}
//获取注册数量
	public int getTotalEnrollment() {
		return enrolledStudents.size();
	}	

	public void display() {
		System.out.println("Section Information:");
		System.out.println("\tSemester:  " + getOfferedIn().getSemester());
		System.out.println("\tCourse No.:  " + 
				   getRepresentedCourse().getCourseNo());
		System.out.println("\tSection No:  " + getSectionNo());
		System.out.println("\tOffered:  " + getDayOfWeek() + 
				   " at " + getTimeOfDay());
		System.out.println("\tIn Room:  " + getRoom());
		if (getInstructor() != null) 
			System.out.println("\tProfessor:  " + 
				   getInstructor().getName());
		displayStudentRoster();
	}
	
	public void displayStudentRoster() {
		System.out.print("\tTotal of " + getTotalEnrollment() + 
				   " students enrolled");
		if (getTotalEnrollment() == 0) System.out.println(".");
		else System.out.println(", as follows:");
		for (Student s : enrolledStudents.values()) {
			System.out.println("\t\t" + s.getName());
		}
	}
	//获取某个学生的成绩
	public String getGrade(Student s) {
		String grade = null;

		TranscriptEntry te = assignedGrades.get(s);
		if (te != null) {
			grade = te.getGrade(); 
		}
		return grade;
	}
//录入成绩
	public boolean postGrade(Student s, String grade) {
		if (!TranscriptEntry.validateGrade(grade)) return false;

		if (assignedGrades.get(s) != null) return false;

		TranscriptEntry te = new TranscriptEntry(s, grade, this);

		assignedGrades.put(s, te);

		return true;
	}
//
	public boolean isSectionOf(Course c) {
		if (c == representedCourse) return true;
		else return false;
	}
}
