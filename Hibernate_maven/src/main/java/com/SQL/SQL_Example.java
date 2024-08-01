package com.SQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.pagination.Pagination_HQL;



public class SQL_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory fact = new Configuration().configure().buildSessionFactory();
		Session s= fact.openSession();
		
		// SQL Query
		String q = "select * from pagination_HQL";
		NativeQuery query = (NativeQuery) s.createQuery(q);
		List<Object[]> list = query.getResultList();
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
		
		s.close();
		fact.close();
		
		

	}

}
