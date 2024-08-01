package com.Hibernate.Hibernate_maven;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import org.hibernate.SessionFactory;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	 
    	System.out.println("Welcome to hibernate Programming!!!");
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    	
    	Student_HibernateAnnotations st = new Student_HibernateAnnotations();
    	int id = sc.nextInt();
    	String name = sc.next();
    	String city = sc.next();
    	st.setSid(id);
    	st.setName(name);
    	st.setCity(city);
    	System.out.println(st);
    	
    	Session session = factory.openSession();
    	Student_HibernateAnnotations student = (Student_HibernateAnnotations)session.get(Student_HibernateAnnotations.class,101);
//		System.out.println(student.ge);
    	Transaction tx = session.beginTransaction();
    	session.save(st);
    	
    	
    	tx.commit();
    	session.close();
    	
    }
}
