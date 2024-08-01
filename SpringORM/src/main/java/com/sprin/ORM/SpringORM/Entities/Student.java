package com.sprin.ORM.SpringORM.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@Column(name="Student_ID")
	private int studentID;
	
	@Column(name="Student_Name")
	private String studentName;
	
	@Column(name="City")
	private String city;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentID, String studentName, String city) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.city = city;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", city=" + city + "]";
	}

}
