package com.springcore.JavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Student {
	
//	@Autowired
	private Teacher teach;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Teacher teach) {
		super();
		this.teach = teach;
	}

	public void study() {
		this.teach.disp();
		System.out.println("Welcome to study!!!");
	}

	public Teacher getTeach() {
		return teach;
	}

	public void setTeach(Teacher teach) {
		this.teach = teach;
	}
	
	
	

}
