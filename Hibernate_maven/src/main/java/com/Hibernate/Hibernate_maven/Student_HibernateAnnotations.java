package com.Hibernate.Hibernate_maven;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.*;
//import jakarta.persistence.Id;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student_HibernateAnnotations {
	
	@Id
	private int sid;
	private String name;
	private String city;
	
	
	public Student_HibernateAnnotations() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student_HibernateAnnotations(int sid, String name, String city) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student_HibernateAnnotations [sid=" + sid + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
