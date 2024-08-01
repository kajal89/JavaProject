package com.Hibernate.Hibernate_maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Address_main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Address address = new Address();
		
		String street = sc.nextLine();
		String city = sc.nextLine();
		boolean op = sc.nextBoolean();
		double d = sc.nextDouble();
		Date date = new Date();
		
		//read image
//		FileInputStream file = new FileInputStream("src/main/java/previous.png");
//		byte[] data = new byte[file.available()];
//		file.read();
		
		address.setStreet(street);
		address.setCity(city);
		address.setOpen(op);
		address.setX(d);
		address.setAddedDate(date);
//		address.setImg(data);		
		System.out.println("data Inserted!!!");
		SessionFactory fact = new Configuration().configure().buildSessionFactory();

		Session sx = fact.openSession();
		Transaction tx = sx.beginTransaction();
		sx.save(address);
		tx.commit();

		sx.close();

	}

}
