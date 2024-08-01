package com.springcore.LifeCycle;

public class xmlConfigure {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public xmlConfigure() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "xmlConfigure [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside Init() ");
		
	}
	public void destroy() {
		System.out.println("Inside Destroy() ");
	}

}
