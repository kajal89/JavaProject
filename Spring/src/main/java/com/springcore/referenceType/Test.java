package com.springcore.referenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/referenceType/configReference.xml");
		A a= (A)context.getBean("aref");
		
		System.out.println("x = " + a.getX());
		System.out.println("y = " + a.getObj().getY());

	}

}
