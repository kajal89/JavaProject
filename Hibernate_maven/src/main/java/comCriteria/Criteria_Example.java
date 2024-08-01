package comCriteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Hibernate_maven.Student_HibernateAnnotations;

public class Criteria_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory fact = new Configuration().configure().buildSessionFactory();
		Session s = fact.openSession();
		Transaction tx = s.beginTransaction();
		 
		
		s.close();
		fact.close();
		
		
		

	}

}
