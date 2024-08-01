package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneConfig.xml");
		
		CollectionStandalone col = context.getBean("standalone",CollectionStandalone.class);
		CollectionStandalone col1 = context.getBean("standalone1",CollectionStandalone.class);
		System.out.println(col);
		System.out.println(col1);

	}

}
