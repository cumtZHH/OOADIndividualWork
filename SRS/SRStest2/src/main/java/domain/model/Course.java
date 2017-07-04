package domain.model;
import java.util.ArrayList;
import java.util.Collection;
public class Course {
	private String courseNo;//课程编号
	private String courseName;//课程名称
	private double credits;//学分
	private ArrayList<Section> offeredAsSection; //作为课程安排提供
	private ArrayList<Course> prerequisites; //先修课程
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String cNo, String cName, double credits) {
		setCourseNo(cNo);
		setCourseName(cName);
		setCredits(credits);
		offeredAsSection = new ArrayList<Section>();
		prerequisites = new ArrayList<Course>();
	}
	public void setCourseNo(String cNo) {
		courseNo = cNo;
	}	
	public String getCourseNo() {
		return courseNo;
	}
	
	public void setCourseName(String cName) {
		courseName = cName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCredits(double c) {
		credits = c;
	}
	
	public double getCredits() {
		return credits;
	}
	public void display() {
		System.out.println("Course Information:");
		System.out.println("\tCourse No.:  " + getCourseNo());
		System.out.println("\tCourse Name:  " + getCourseName());
		System.out.println("\tCredits:  " + getCredits());
		System.out.println("\tPrerequisite Courses:");

		for (Course c : prerequisites) {
			System.out.println("\t\t" + c.toString());
		}

		System.out.print("\tOffered As Section(s):  ");
		for (Section s : offeredAsSection) {
			System.out.print(s.getSectionNo() + " ");
		}

		System.out.println();
	}
	
	@Override
	public String toString() {
		return getCourseNo() + ":  " + getCourseName();
	}
//添加先修课程
	public void addPrerequisite(Course c) {
		prerequisites.add(c);
	}
//判断是否有先修课程
	public boolean hasPrerequisites() {
		if (prerequisites.size() > 0) return true;
		else return false;
	}
//collection接口，子接口：set、list,只能放置对象的引用，不能放置原生数据类型，
	//我们需要使用原生数据类型的封装类才能加入到集合中 
	//获取先修课程
	public Collection<Course> getPrerequisites() {
		return prerequisites;
	}
//一个课程在section里不止提供一次
	public Section scheduleSection(char day, String time, String room,
				       int capacity) {
		Section s = new Section(offeredAsSection.size() + 1, 
				day, time, this, room, capacity);
		addSection(s);
		
		return s;
	}

	public void addSection(Section s) {
		offeredAsSection.add(s);
	}
}
