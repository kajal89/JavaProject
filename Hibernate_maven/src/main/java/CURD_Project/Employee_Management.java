package CURD_Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import jakarta.persistence.*;

public class Employee_Management {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean done = true;
//		List<Employee_List> list = new ArrayList<Employee_List>();

		while (true) {
			System.out.println("Enter Your Choice ");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Delete Employee");
			System.out.println("4. Display Employee");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				addEmployee();

				break;
			case 2:
				updateEmployee();

				break;
			case 3:
				deleteEmployee();
				break;
			case 4:
				displayEmployee();
				break;
			default:
				System.out.println("wrong input");
				return;

			}

		}

	}

	public static void addEmployee() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Employee_List emp = new Employee_List();
		System.out.println("Enter Employee ID : ");
		int id = sc.nextInt();
		System.out.println("Enter Employee name : ");
		String ename = sc.next();
		System.out.println("Enter Salary  : ");
		long sal = sc.nextLong();
		emp.setEmployeeId(id);
		emp.setEmployeeName(ename);
		emp.setSalary(sal);
		session.save(emp);
		tx.commit();
		session.close();
		factory.close();

	}

	public static void updateEmployee() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("Enter Employee ID for Updatation : ");
		int uid = sc.nextInt();
//		Employee_List e = (Employee_List)session.get(Employee_List.class, uid);
		System.out.println("Enter Employee name : ");
		String ename = sc.next();
		System.out.println("Enter Salary  : ");
		long sal = sc.nextLong();
		String query = "update Employee_List set employeeName =: e_name, salary=: e_sal where employeeId=:u_id";
		Query q = session.createQuery(query);
		q.setParameter("e_name", ename);
		q.setParameter("e_sal", sal);
		q.setParameter("u_id", uid);
		int status = q.executeUpdate();
		System.out.println(status);
		tx.commit();
		session.close();
		factory.close();
	}

	
	public static void deleteEmployee() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.println("Enter Employee ID which we want to Delete : ");
		int uid = sc.nextInt();
		Query query = session.createQuery("delete from Employee_List where employeeId=:u_id");
		query.setParameter("u_id", uid);
		query.executeUpdate();
		System.out.println("Record deleted sucessfully !!!!");
		tx.commit();
		session.close();
		factory.close();
		
		
	}
	
	public static void displayEmployee() {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("from Employee_List ");

		List<Employee_List> list = query.getResultList();
		System.out.println("Employee Details are !!!!");
		for (Employee_List employee_List : list) {
			System.out.println(employee_List.getEmployeeId());
			System.out.println(employee_List.getEmployeeName());
			System.out.println(employee_List.getSalary());
		}
		tx.commit();
		session.close();
		factory.close();

	}

}
