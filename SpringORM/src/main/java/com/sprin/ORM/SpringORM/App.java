package com.sprin.ORM.SpringORM;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sprin.ORM.SpringORM.DAO.StudentDAO;
import com.sprin.ORM.SpringORM.Entities.Student;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("ORMConfig.xml");
		StudentDAO stud = context.getBean("studentDAO", StudentDAO.class);
		while (true) {
			System.out.println("Enter Your Choice");
			System.out.println("1.Add Student");
			System.out.println("2.Display All Student");
			System.out.println("3.Get Single Student");
			System.out.println("4.Delete Student");
			System.out.println("5.Upadte Student");
			System.out.println("6.Exit");

			int choice = sc.nextInt();
			try {
				switch (choice) {
				case 1:
					System.out.println("Enter Student ID :");
					int id = sc.nextInt();
					System.out.println("Enter Student Name : ");
					String name = sc.next();
					System.out.println("Enter City : ");
					String city = sc.next();
					Student st = new Student(id, name, city);
					stud.insert(st);
					System.out.println("Data Inserted !!!!");

					break;

				case 2:
					//Display All data
					stud.getAllStudent();
					break;
				case 3:
					//Display Single data
					int getId = sc.nextInt();
					stud.getStudent(getId);
					break;
				case 4:
					//Delete Data
					System.out.println("Enter Id which you want to delete ? ");
					int deleteId = sc.nextInt();
					stud.deleteStudent(deleteId);
					break;
				case 5:
					//Update data
					
					break;
				case 6:
					return;
				
				}
			} 
			catch (Exception e) {
				System.out.println("Wrong input try with other !!");
				System.out.println(e.getMessage());

			}
		}

	}
}
