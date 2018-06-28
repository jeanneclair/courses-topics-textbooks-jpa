package org.wecancodeit.coursestopicstextbooksjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	
	@Autowired
	TopicRepository topicRepo;
	
	@Autowired
	TextbookRepository textbookRepo;
	
	@Autowired
	CourseRepository courseRepo;
	
	@RequestMapping("/courses")
	public String getTopics(Model model) {
		model.addAttribute("courses", courseRepo.findAll());
		return "courses";
	}
	
	@RequestMapping("/courses/{id}")
	public String getCourse(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("course", courseRepo.findOne(id));
		return "course";
		
	}


}
