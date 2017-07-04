package domain.repository.sqlite;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import domain.model.Course;

public class CourseRepository{
	public HashMap<String,Course> findAll() {
		   HashMap<String,Course> courses = new HashMap<String, Course>();
	        ResultSet rs=util.DBUtil.executeQuery("select * from course", new Object[]{});
	        try {
	            while (rs.next()) {
	            	Course course=new Course();
	            	course.setCourseNo(rs.getString(1));
	            	course.setCourseName(rs.getString(2));
	            	course.setCredits(rs.getDouble(3));
	            	courses.put(course.getCourseNo(), course);
	            }
	        } catch (SQLException ex) {
	        }
	        return courses;
	    }
}
