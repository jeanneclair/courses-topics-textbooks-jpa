package org.wecancodeit.coursestopicstextbooksjpa;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CoursePopulatorTest {
	

	@Autowired
	CoursePopulator populator;

	@Test
	public void populatorShouldSaveAndLoadTopic() {
		
		Topic testTopic = new Topic("java", "java101");
		populator.addTopic();
		Topic underTest = populator.getTopic();
		assertThat 
	}
	
	

}
