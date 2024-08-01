package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Pagination {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Pagination_HQL");
		
		query.setFirstResult(0);
		query.setMaxResults(4);
		
		List<Pagination_HQL> list =query.getResultList();
		for (Pagination_HQL pagination_HQL : list) {
			System.out.println(pagination_HQL.getpID()  + ":" + pagination_HQL.getPname() + ":" + pagination_HQL.getCourse());
			
		}
		tx.commit();
		session.close();
		factory.close();
	}

}
