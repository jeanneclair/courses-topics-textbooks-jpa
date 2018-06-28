package org.wecancodeit.coursestopicstextbooksjpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Course {
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String description;

	@ManyToMany(mappedBy = "courses")
	Collection<Topic> topics;
	
	@ManyToMany(mappedBy = "courses")
	Collection<Textbook> textbooks;
	
	public Course() {
		
	}


	public Course(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}


	public String getTitle() {
		return title;
	}
	
	public Long getId() {
		return id;
	}
	
	
	public Collection<Topic> getTopics() {
		return topics;
	}
	
	
	public Collection<Textbook> getTextbooks() {
		return textbooks;
	}
	
	public String getDescription() {
		return description;
	}


	@Override
	public String toString() {
		return "Course: "  + title +", " + description +", " + topics +", " + textbooks;
	}
	
	
	

}
