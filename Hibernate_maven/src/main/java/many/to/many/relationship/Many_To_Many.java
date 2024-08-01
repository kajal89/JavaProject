package many.to.many.relationship;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;

public class Many_To_Many {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Employee_ex emp1 = new Employee_ex();
		Employee_ex emp2 = new Employee_ex();
		 
		List<Projects> projectList = new ArrayList<Projects>() ;
		
		List<Employee_ex> employeeList = new ArrayList<Employee_ex>() ;
		// add data into emp
		emp1.seteId(10);
		emp1.setName("Soma");
		
		emp2.seteId(11);
		emp2.setName("Rekha");
		employeeList.add(emp1);
		employeeList.add(emp2);
		//assign 2 project for one employee
		emp1.setProjects(projectList);
		
		Projects proj1 = new Projects();
		Projects proj2 = new Projects(); 
		
		proj1.setpId(1);
		proj1.setProjectName("Bayer Support");
		
		proj2.setpId(2);
		proj2.setProjectName("E-commerse");
		
		projectList.add(proj1);
		projectList.add(proj2);
		//assign 2 employee for one project
		proj2.setEmployee(employeeList);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(proj1);
		session.save(proj2);
		
		
		tx.commit();
		session.close();
		factory.close();
	}

}
