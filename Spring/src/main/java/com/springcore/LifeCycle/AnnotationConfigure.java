package com.springcore.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationConfigure {
	private String subject;

	public AnnotationConfigure() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "AnnotationConfigure [subject=" + subject + "]";
	}
	
	//methods for init and destroy
	
	@PostConstruct
	public void start() {
		System.out.println("Init() : Annotation");
	}

	@PreDestroy
	public void end() {
		System.out.println("Destroy() : Annotation");
	}
}
