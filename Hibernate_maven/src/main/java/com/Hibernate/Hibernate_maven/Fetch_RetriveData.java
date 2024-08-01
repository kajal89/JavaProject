package com.Hibernate.Hibernate_maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//fetch data using load() and get()
public class Fetch_RetriveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		//fetch using get()
		Student_HibernateAnnotations student = (Student_HibernateAnnotations)session.get(Student_HibernateAnnotations.class,101);
		
		//fetch using load()
		Address add = (Address)session.get(Address.class, 1);
		System.out.println("using get() : " + student);
		System.out.println("using load() : " + add);
//		session.remove(student);
		session.close();
		factory.close();

	}

}
