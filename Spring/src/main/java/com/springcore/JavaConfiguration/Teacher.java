package com.springcore.JavaConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Teacher {
	
	
	private int id;

	@Override
	public String toString() {
		return "Teacher [id=" + id + "]";
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public void disp() {
		System.out.println("Welcome in teacher");
	}

}
