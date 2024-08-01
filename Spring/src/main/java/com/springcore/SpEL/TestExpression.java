package com.springcore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestExpression {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SpEL/SpELConfig.xml");
		
		Expression e = context.getBean("expression", Expression.class);
		System.out.println(e);

	}

}
