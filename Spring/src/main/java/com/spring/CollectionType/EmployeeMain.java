package com.spring.CollectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/CollectionType/configCollection.xml");
		
		Employee emp1 = (Employee) context.getBean("employee1");
		System.out.println(emp1);

	}

}
