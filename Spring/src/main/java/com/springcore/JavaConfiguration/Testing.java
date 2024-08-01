package com.springcore.JavaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using annotation crate config file so use AnnotationConfigApplicationContext
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student stud = context.getBean("getStudent",Student.class);
		stud.study();
		stud.getTeach();
		System.out.println(stud);
	}

}
