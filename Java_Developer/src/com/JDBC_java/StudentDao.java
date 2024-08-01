package com.JDBC_java;

import java.sql.*;

public class StudentDao {
	
	public static  boolean studentInser(Student st) {
		boolean f=false;
		
		try {
			Connection con = Connection_Generate.createConnection();
			
			String query = "insert into Student(sname) values(?)";
			PreparedStatement p = con.prepareStatement(query);
			p.setString(1,st.getName());
			p.executeUpdate();
			f=true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static  boolean studentDelete(int id) {
		boolean f=false;
		
		try {
			Connection con = Connection_Generate.createConnection();
			
			String query = "delete from Student where sid=?";
			PreparedStatement p = con.prepareStatement(query);
			p.setInt(1,id);
			p.executeUpdate();
			f=true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	
	public static  void studentDdisply() {
		
		
		try {
			Connection con = Connection_Generate.createConnection();
			
			String query = "select * from Student";
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(query);
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(id + "\t" + name);
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	public static  boolean studentUpdate(String name) {
		boolean f=false;
		
		try {
			Connection con = Connection_Generate.createConnection();
			
			String query = "update Student set name=? where sid=1";
			PreparedStatement p = con.prepareStatement(query);
//			p.setInt(1, id);
			p.setString(2,name);
			p.execute();
			f=true;
			
		}
		 catch (SQLException e) { 
	            System.out.println(e); 
	        }
		return f;
	}

	
	

}
