package com.Hibernate.Hibernate_maven;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

//@Entity
@Embeddable
public class Certifications {
	private String course;
	private int duration;
	public Certifications() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certifications(String course, int duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Certifications [course=" + course + ", duration=" + duration + "]";
	}
	

}
