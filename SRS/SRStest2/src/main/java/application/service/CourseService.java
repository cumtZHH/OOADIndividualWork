package application.service;

import domain.model.Course;
import domain.model.CourseCatalog;
import domain.repository.mock.CourseRepository;

public class CourseService {
	
	private static CourseCatalog  courses;
	private CourseRepository courseRepository = null;
	
	public CourseService(CourseRepository courseRepository){
		this.courseRepository = courseRepository;
		courses = new CourseCatalog(courseRepository.findAll());
	}

	public CourseCatalog getCourseCatalog() {
		return courses;
	}
	
	public Course findCourse(String courseNo){
	   return courses.findCourse(courseNo);
	}
}
