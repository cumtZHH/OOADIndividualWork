package application.service;

import domain.model.ScheduleOfClasses;
import domain.model.Section;
import domain.repository.mock.SectionRepository;

public class ScheduleOfClassesService {
	
    private static ScheduleOfClasses sc;
	private SectionRepository sectionRepository = null;
    
    public ScheduleOfClasses getScheduleOfClasses() {
		return sc;
	}    
    
    public ScheduleOfClassesService(String semester, SectionRepository sectionRepository){
    	sc = new ScheduleOfClasses(semester, sectionRepository.findBySemester(semester));
    }
    

}
