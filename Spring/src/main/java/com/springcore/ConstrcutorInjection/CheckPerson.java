package com.springcore.ConstrcutorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CheckPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ConstrcutorInjection/configConstruction.xml");
		
		Person p1 = (Person) context.getBean("person1");
		Person p2 = (Person) context.getBean("person2");
		
		Addition a1 = (Addition) context.getBean("add");
		System.out.println(p1);
		System.out.println(p2);
		a1.sum();

	}

}
