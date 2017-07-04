package domain.factory;

import domain.repository.mock.CourseRepository;
import domain.repository.mock.ScheduleRepository;
import domain.repository.mock.SectionRepository;
import domain.repository.mock.UserRepository;

public class DbFactory {
//	private static String repositoryName = "domain.repository.sqlite";
	private static String repositoryName = "domain.repository.mock";
	
	public static ScheduleRepository createScheduleRepository() {
		ScheduleRepository result = null;
		try {
			Object o = Class.forName(repositoryName + "." + "ScheduleRepository").newInstance();
			result = (ScheduleRepository)o;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public static CourseRepository createCourseRepository() {
		CourseRepository result = null;
		try {
			Object o = Class.forName(repositoryName + "." + "CourseRepository").newInstance();
			result = (CourseRepository)o;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public static SectionRepository createSectioneRepository() {
		SectionRepository result = null;
		try {
			Object o = Class.forName(repositoryName + "." + "SectionRepository").newInstance();
			result = (SectionRepository)o;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}	
	
	public static UserRepository createUserRepository() {
		UserRepository result = null;
		try {
			Object o = Class.forName(repositoryName + "." + "UserDao" + "Impl").newInstance();
			result = (UserRepository)o;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
