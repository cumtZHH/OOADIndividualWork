package domain.repository.mock;

import java.util.HashMap;
import java.util.Map;

import domain.model.Professor;
import domain.model.Section;
import domain.model.Student;

public class PersonRepository{

	public HashMap<String, Professor> findAllProfessors() {
		
		HashMap<String, Professor> professors = new HashMap<String, Professor>();
		
		Professor p1, p2, p3;
		p1 = new Professor("Jacquie Barker", "123-45-6789", "123456","Adjunct Professor", "Information Technology");
		professors.put(p1.getSsn(), p1);
		p2 = new Professor("John Smith", "567-81-2345", "123456","Full Professor", "Chemistry");
		professors.put(p2.getSsn(), p2);
		p3 = new Professor("Snidely Whiplash", "987-65-4321", "123456","Full Professor", "Physical Education");
		professors.put(p3.getSsn(), p3);		
		return professors;
	}
    public HashMap<String, Student> findAllStudents() {
		
		HashMap<String, Student> students = new HashMap<String, Student>();
		
		Student s1, s2, s3;
		s1 = new Student("Joe Blow", "111-11-1111", "Math", "M.S.","123456");
		students.put(s1.getSsn(), s1);
		s2 = new Student("Fred Schnurd", "222-22-2222", 
				 "Information Technology", "Ph. D.","123456");
		students.put(s2.getSsn(), s2);
		s3 = new Student("Mary Smith", "333-33-3333", "Physics", "B.S.","123456");		
		students.put(s3.getSsn(), s3);
		return students;
	}

}
