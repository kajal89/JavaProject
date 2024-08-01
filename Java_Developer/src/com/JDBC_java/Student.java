package com.JDBC_java;

public class Student {
	private int studId;
	private String name;
	public Student(int studId, String name) {
		super();
		this.studId = studId;
		this.name = name;
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + "]";
	}

}
