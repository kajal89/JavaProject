package com.Hibernate.Hibernate_maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbadableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setName("Kajal");
		emp.setSalary(30000);
		
		Certifications certificate = new Certifications();
		
		certificate.setCourse("Hibernate");
		certificate.setDuration(3);
		
		emp.setCertificate(certificate);
		
		System.out.println("Data Inserted !!!!");
		System.out.println(emp);
		
//		Employee emp1 = (Employee)session.get(Employee.class, 10);
//		session.save("" + emp1);
		transaction.commit();
		
		session.close();
		factory.close();
	}

}
