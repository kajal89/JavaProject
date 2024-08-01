package com.springcore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Stereotype/stereotypeConfig.xml");
		
		Student s = context.getBean("student",Student.class);// student is object created by spring which is in a camle case
		System.out.println(s);

	}

}
