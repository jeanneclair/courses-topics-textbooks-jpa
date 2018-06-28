package org.wecancodeit.coursestopicstextbooksjpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Textbook {
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	
	@ManyToMany
	private Collection<Course> courses;
	
	public Textbook (String title, Course ...courses) {
		this.title = title;
		this.courses = Arrays.asList(courses);
	}
	
	
	protected Textbook() {
		
	}
	

	public String getTitle() {
		return title;
	}
	

	public Long getId() {
		return id;
	}


	public Collection<Course> getCourses() {
		return courses;
	}


	@Override
	public String toString() {
		return "Textbook: " + title;
	}


	
	

}
