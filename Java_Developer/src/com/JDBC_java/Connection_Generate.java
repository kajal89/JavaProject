package com.JDBC_java;
import java.util.*;
import java.sql.*;
public class Connection_Generate {
	static Connection  con;
	public static Connection createConnection() {
		
		//(write in try catch otherwise it gives error)
		
		
		try {
			//load connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection 
			String user = "root";
			String pass ="Kajal@7890";
			String url = "jdbc:mysql://localhost:3306/JDBC_Program";
			 con = DriverManager.getConnection(url,user,pass);
			
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return con;
		
	}
	

}
