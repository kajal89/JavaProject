package com.springcore.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceConfigure implements InitializingBean,DisposableBean{
	private double price;

	public InterfaceConfigure() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "InterfaceConfigure [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is inside Init() using Interface");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside Distroy : Interface");
	}
	

}
