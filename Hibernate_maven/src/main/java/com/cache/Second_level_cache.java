package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Hibernate_maven.Student_HibernateAnnotations;





public class Second_level_cache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session s1 = f.openSession();
		Student_HibernateAnnotations st1 = s1.get(Student_HibernateAnnotations.class, 101);
		System.out.println(st1);
		s1.close();
		Session s2 = f.openSession();
		Student_HibernateAnnotations st2 = s1.get(Student_HibernateAnnotations.class, 101);
		System.out.println(st2);
		s2.close();
	}

}
