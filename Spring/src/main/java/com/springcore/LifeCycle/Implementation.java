package com.springcore.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractApplicationContext using this we enable destory()
		
		AbstractApplicationContext c = new ClassPathXmlApplicationContext("com/springcore/LifeCycle/configureXML.xml");
		
		System.out.println("LifeCycle using XML");
		xmlConfigure con = (xmlConfigure) c.getBean("xml");
		System.out.println(con);
		
		c.registerShutdownHook();
		System.out.println("***********************");
		System.out.println("LifeCycle using Interface");
		InterfaceConfigure config = (InterfaceConfigure) c.getBean("interface");
		System.out.println(config);
		
		
		System.out.println("******************");
		AnnotationConfigure annotation1 = (AnnotationConfigure)c.getBean("annotation");
		System.out.println(annotation1);

	}

}
