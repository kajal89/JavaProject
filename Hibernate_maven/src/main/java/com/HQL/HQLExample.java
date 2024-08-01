package com.HQL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Hibernate_maven.Address;
import com.Hibernate.Hibernate_maven.Student_HibernateAnnotations;

import jakarta.persistence.Query;

public class HQLExample {
	public static void main(String[] args) {
		SessionFactory fact = new Configuration().configure().buildSessionFactory();

//		Student_HibernateAnnotations stud = new Student_HibernateAnnotations();
		Session session = fact.openSession();
		Transaction tx = session.beginTransaction();

		String query = "from Address where AId=1";//for particular condition
		Query q = session.createQuery(query);

//		for fetch multiple result then it is use
		List<Address> list = ((org.hibernate.query.Query) q).list();
		
		for (Address address : list) {
			System.out.println("City : " + address.getCity());
			System.out.println("Street: " +address.getStreet());
			
		}
		System.out.println("-----------------------------------");
		Query q2 = session.createQuery("update Address set city=: c where AId=:id");
		q2.setParameter("c", "Mumbai");
		q2.setParameter("id", 1);
		q2.executeUpdate();
		System.out.println("Data Updated !!");
		System.out.println("-----------------------------------");
		q2= session.createQuery("delete from Address where AId=:id1");
		q2.setParameter("id1", 2);
		q2.executeUpdate();
		System.out.println("data deleted !!");
		
		
		// joins in HQL
		Query join = session.createQuery("select personId,personName, brand from Person LEFT OUTER JOIN Laptop on Person.personId = Laptop.laptopId");
		List<Object []> join_list = join.getResultList();
		for (Object[] objects : join_list) {
			System.out.println(Arrays.toString(objects));
			
		}
		
		session.close();

		fact.close();
	}

}
