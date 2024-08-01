package com.springcore.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class First_Spring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Stud st = (Stud) context.getBean("student1");
		
		Stud st1 =(Stud) context.getBean("student2");
		System.out.println("Using property injection : " + st);
		System.out.println("Using p schema : " + st1);
		
		

	}

}
