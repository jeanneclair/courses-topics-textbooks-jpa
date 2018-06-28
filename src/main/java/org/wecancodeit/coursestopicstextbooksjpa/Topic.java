package org.wecancodeit.coursestopicstextbooksjpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Topic {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@ManyToMany
	private Collection<Course> courses;
	
	public Topic(String name, Course...courses) {
		super();
		this.name = name;
		this.courses = Arrays.asList(courses);
	}
	

	public Topic() {		
	}

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Collection<Course> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Topic: " + name;
	}
	
	
	

}
