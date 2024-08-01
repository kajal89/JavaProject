package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Expression {
	
	@Value("#{10+90}")
	private int x;
	
	@Value("#{30}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(16)}")
	private int squre;
	
	@Value("#{new java.lang.String.('Kajal Mule')}")
	private String name;
	
	public Expression() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public int getSqure() {
		return squre;
	}
	public void setSqure(int squre) {
		this.squre = squre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Expression [x=" + x + ", y=" + y + ", squre=" + squre + ", name=" + name + "]";
	}
	
	

}
