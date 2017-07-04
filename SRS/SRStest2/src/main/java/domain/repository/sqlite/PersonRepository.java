package domain.repository.sqlite;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import domain.model.Course;
import domain.model.Professor;
import domain.model.Section;
import domain.model.Student;

public class PersonRepository{

	public HashMap<String, Professor> findAllProfessors() {
		
		HashMap<String, Professor> professors = new HashMap<String, Professor>();
		
		ResultSet rs=util.DBUtil.executeQuery("select * from professor", new Object[]{});
        try {
            while (rs.next()) {
            	Professor professor=new Professor();
            	professor.setSsn(rs.getString(1));
            	professor.setName(rs.getString(2));
            	professor.setTitle(rs.getString(3));
            	professor.setDepartment(rs.getString(4));
            	professors.put(professor.getSsn(), professor);
            }
        } catch (SQLException ex) {
        }
        return professors;
	}
    public HashMap<String, Student> findAllStudents() {
		
		HashMap<String, Student> students = new HashMap<String, Student>();
		
		ResultSet rs=util.DBUtil.executeQuery("select * from student", new Object[]{});
        try {
            while (rs.next()) {
            	Student student=new Student();
            	student.setSsn(rs.getString(1));
            	student.setName(rs.getString(2));
            	student.setDegree(rs.getString(3));
            	student.setMajor(rs.getString(4));
            	student.setPassword(rs.getString(5));
            	students.put(student.getSsn(), student);
            }
        } catch (SQLException ex) {
        }
        return students;
	}

}
