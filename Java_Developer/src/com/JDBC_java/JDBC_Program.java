package com.JDBC_java;
import java.util.*;

public class JDBC_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to java JDBC Program");
		
		while(true) {
			System.out.println("Press 1 to Insert");
			System.out.println("Press 2 to Delete");
			System.out.println("Press 3 to Display");
			System.out.println("Press 4 to Update");
			System.out.println("Press 5 to Exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				//Add
				System.out.println("Enter user name");
				String name=sc.next();
				Student st = new Student(name);
				boolean ans = StudentDao.studentInser(st);
				if(ans){
					System.out.println("Record is Inserted!!!!!!!");
				}
				else {
					System.out.println("Something Wrong!!");
				}
//				System.out.println(st);
				
				break;
			case 2:
				//delete
				System.out.println("Enter user ID to be delete");
				int id = sc.nextInt();
				boolean ans1 = StudentDao.studentDelete(id);
				if(ans1) {
					System.out.println("Record is deleted!!!!!");
					
				}
				else {
					System.out.println("Something is wrong!");
				}
				break;
			case 3:
				//display
				System.out.println(".....All data.....");
				StudentDao.studentDdisply();
				break;
			case 4:
				//Update
//				System.out.println("Enter updated id");
//				int id1= sc.nextInt();
				System.out.println("Enter updated name");
				String name1 = sc.next();
				boolean ans3 = StudentDao.studentUpdate(name1);
				if(ans3) {
					System.out.println("Record is Updated.....");
				}
				else {
					System.out.println("Something is wrong!");
				}
				break;
			case 5:
				//exit
				return ;
			}
			
			
			
		}

	}

}
