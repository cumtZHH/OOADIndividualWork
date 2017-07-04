package domain.model;
public enum EnrollmentStatus {
	success("Enrollment successful!  :o)"), 
	//选课人数已满
	secFull("Enrollment failed;  section was full.  :op"), 
	//没有学习先修课程
	prereq("Enrollment failed; prerequisites not satisfied.  :op"), 
	//已经登记过了
	prevEnroll("Enrollment failed; previously enrolled.  :op");
	private final String value;
	EnrollmentStatus(String value) {
		this.value = value;
	}
	public String value() {
		return value;
	}
}
