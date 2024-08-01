package com.pagination;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pagination_HQL {
	
	@Id
	private int pID;
	private String Pname;
	private String course;
	public Pagination_HQL() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pagination_HQL(int pID, String pname, String course) {
		super();
		this.pID = pID;
		Pname = pname;
		this.course = course;
	}
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Pagination_HQL [pID=" + pID + ", Pname=" + Pname + ", course=" + course + "]";
	}
	

}
