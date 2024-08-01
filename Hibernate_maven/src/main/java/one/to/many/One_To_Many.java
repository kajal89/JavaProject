package one.to.many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One_To_Many {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Person person = new Person();
		person.setPersonId(12);
		person.setPersonName("Kajal");
		
		Laptop lap = new Laptop();
		lap.setLaptopId(101);
		lap.setBrand("Dell");
		
		Laptop lap1 = new Laptop();
		lap1.setLaptopId(102);
		lap1.setBrand("HP");
		
		List<Laptop> list = new ArrayList<Laptop>();
		list.add(lap);
		list.add(lap1);
		
		person.setLaptops(list);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
	
		session.save(person);
		tx.commit();
		
		session.close();
		factory.close();
		
		
		

	}

}
