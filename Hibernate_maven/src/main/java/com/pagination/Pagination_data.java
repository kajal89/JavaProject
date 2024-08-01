package com.pagination;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Pagination_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Pagination_HQL pq = new Pagination_HQL();
		System.out.println("Enter PID ");
		int pid= sc.nextInt();
		System.out.println("Enter PName");
		String pname = sc.next();
		System.out.println("Enter Course");
		String course = sc.next();
		
		pq.setpID(pid);
		pq.setPname(pname);
		pq.setCourse(course);
		System.out.println("Data Inserted !!!!");
		session.save(pq);
		
	//	Query query =session.createQuery("insert into Pagination_HQL(pID, Pname,course)");
		
		
		tx.commit();
		
		session.close();
		factory.close();
	}

}
