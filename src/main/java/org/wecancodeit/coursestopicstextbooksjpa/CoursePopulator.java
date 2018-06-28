package org.wecancodeit.coursestopicstextbooksjpa;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CoursePopulator implements CommandLineRunner {
	
	
	@Resource
	private TopicRepository topicRepo;
	
	@Resource
	private TextbookRepository textbookRepo;
	
	@Resource
	private CourseRepository courseRepo;
	
	public CoursePopulator() {
			
	}

	@Override
	public void run(String... args) throws Exception {
		Course introToJava = new Course("Intro to Java", "description");
		Course introToSpring = new Course("Intro to the Spring Framework", "description");
		Course advSoftware = new Course("Advanced Software Design", "description");
		Course intro = new Course("Introduction to HTML, CSS, & JS", "description");
		
		courseRepo.save(introToJava);
		courseRepo.save(introToSpring);
		courseRepo.save(advSoftware);
		courseRepo.save(intro);
		
		Topic java = new Topic("Java", introToJava, introToSpring, advSoftware);
		Topic spring = new Topic("Spring", introToSpring, advSoftware);
		Topic tdd = new Topic("TDD", advSoftware, intro);
		Topic frontend = new Topic("Frontend", intro);
		
		topicRepo.save(java);
		topicRepo.save(spring);
		topicRepo.save(tdd);
		topicRepo.save(frontend);
		
		
		Textbook hfj = new Textbook("Head First Java", introToJava);
		Textbook hfdp = new Textbook("Head First Design Patterns", advSoftware);
		Textbook cc = new Textbook("Clean Code", introToSpring, advSoftware, intro);
		Textbook jpa = new Textbook("Intro to JPA", introToSpring);
		Textbook js = new Textbook("JavaScript: The Good Parts", intro);
		
		textbookRepo.save(hfj);
		textbookRepo.save(hfdp);
		textbookRepo.save(cc);
		textbookRepo.save(jpa);
		textbookRepo.save(js);

		
	}
	

}
