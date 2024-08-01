package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Hibernate_maven.Student_HibernateAnnotations;

public class First_level_cache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session s = f.openSession();
		Student_HibernateAnnotations st = s.get(Student_HibernateAnnotations.class, 101);
		System.out.println(st);
		
		System.out.println("We are working!!!");
		Student_HibernateAnnotations st1 = s.get(Student_HibernateAnnotations.class, 101);
		
		System.out.println(st1);
		System.out.println(s.contains(st1));
		
		s.close();
		f.close();

	}

}
