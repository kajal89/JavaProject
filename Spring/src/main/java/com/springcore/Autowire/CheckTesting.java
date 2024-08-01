package com.springcore.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CheckTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Autowire/AutowireConfig.xml");
		Employee a = (Employee) context.getBean("employee1");// we use this as well for typecasting 
		
		//Employee e = context.getBean("employee1",Employee.class);
		System.out.println("byName : " + a);
//		Employee e = context.getBean("employee2",Employee.class);
//		System.out.println("byType : " + e);
		
		Employee e1 = context.getBean("employee3",Employee.class);
		System.out.println("constructor : " + e1);
		

	}

}
