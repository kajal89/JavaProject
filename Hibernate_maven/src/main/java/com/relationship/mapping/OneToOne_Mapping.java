package com.relationship.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne_Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//transient state 
		Quastion qus = new Quastion();
		qus.setQId(1);
		qus.setQustion("What is java");
		
		//create answer object
		Answer answ = new Answer();
		answ.setAId(101);
		answ.setAns("Java is a programming lang");
		qus.setAnswer(answ);
		
		
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		// persistent state 
		session.save(qus);
//		session.save(qus1);
		tx.commit();
		
		//fetching data from db
		Quastion fetch = (Quastion)session.get(Quastion.class,1);
		System.out.println("Quastion : " + fetch.getQustion());
		System.out.println("Answer -> " + fetch.getAnswer().getAns());
		
		// this is detached state 
		session.close();
		factory.close();

	}

}
