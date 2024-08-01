package com.springcore.ConstrcutorInjection;

import java.util.List;

public class Person {
	private int id;
	private String pname;
	private List<String> address;
	public Person(int id, String pname, List<String> address) {
		super();
		this.id = id;
		this.pname = pname;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", pname=" + pname + ", address=" + address + "]";
	}
	
	
	

}
