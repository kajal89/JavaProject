package com.springcore.Autowire.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CheckTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Autowire/Annotation/AutowireConfig.xml");
		Employee a = (Employee) context.getBean("employee3");// we use this as well for typecasting 
		
		System.out.println("constructor : " + a);
		

	}

}
