package domain.model;
import java.util.ArrayList;

public class Professor extends Person {
	private String title;//类型
	private String department;//学院
	private ArrayList<Section> teaches; //教授的课程安排
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(String name, String ssn,String password, String title, String dept) {
		super(name, ssn, password);//Person类继承
		setTitle(title);
		setDepartment(dept);
		teaches = new ArrayList<Section>();
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setDepartment(String dept) {
		department = dept;
	}

	public String getDepartment() {
		return department;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Professor-Specific Information:");
		System.out.println("\tTitle:  " + getTitle());
		System.out.println("\tTeaches for Dept.:  " + getDepartment());
		displayTeachingAssignments();
		System.out.println();
	}

	@Override
	public String toString() {
		return getName() + " (" + getTitle() + ", " +
		       getDepartment() + ")";
	}

	public void displayTeachingAssignments() {
		System.out.println("Teaching Assignments for " + getName() + ":");
		if (teaches.size() == 0) {
			System.out.println("\t(none)");
		}

		else for (Section s : teaches) {
			System.out.println("\tCourse No.:  " +
				s.getRepresentedCourse().getCourseNo());
			System.out.println("\tSection No.:  " + 
				s.getSectionNo());
			System.out.println("\tCourse Name:  " +
				s.getRepresentedCourse().getCourseName());
			System.out.println("\tDay and Time:  " +
				s.getDayOfWeek() + " - " + 
				s.getTimeOfDay());
			System.out.println("\t-----");
		}
	}
	
	public void agreeToTeach(Section s) {
		teaches.add(s);
		s.setInstructor(this);
	}
}
