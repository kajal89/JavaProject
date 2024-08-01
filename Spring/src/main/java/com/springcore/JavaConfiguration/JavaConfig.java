package com.springcore.JavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.JavaConfiguration")
public class JavaConfig {
	
	@Bean
	public Teacher getTeacher() {
		return new Teacher();
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(getTeacher());
		return student;
		
	}

}
