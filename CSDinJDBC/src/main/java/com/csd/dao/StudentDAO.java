package com.csd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/";
	
	public void createStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection(DB_URL, "root", "Akriti123@");

			Statement stmt = con.createStatement();
	         String sql = "CREATE DATABASE STUDENTS";
	         stmt.executeUpdate(sql);
	         System.out.println("Database created successfully..."); 
	         
	      } catch (SQLException | ClassNotFoundException e) {
	    	  System.err.println("Database Creation exception"+e);
	    }
		
	}
	public void dropStudent(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection(DB_URL, "root", "Akriti123@");

			Statement stmt = con.createStatement();
			String sql = "DROP DATABASE STUDENTS";
	        stmt.executeUpdate(sql);
	        System.out.println("Database dropped successfully...");  
	        
	      } catch (SQLException | ClassNotFoundException e) {
	    	  System.err.println("Database droped exception"+e);
	      } 
       }
	public void selectStudent(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection(DB_URL, "root", "Akriti123@");
			 System.out.println("Connected database successfully...");  
			 System.out.println("Connecting to a selected database...");
	      } catch (SQLException | ClassNotFoundException e) {
	    	  System.err.println("Database selection exception"+e);
	      } 
       }
}

