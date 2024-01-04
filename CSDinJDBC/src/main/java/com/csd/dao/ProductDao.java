package com.csd.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import java.sql.*;

import com.csd.bean.Product;


public class ProductDao {
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/";
	public Product SelecteProduct(int pid) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection(DB_URL+"mydb_phase2", "root", "Akriti123@");
			PreparedStatement pstmt = con.prepareStatement("Select from product where pid = ?");
			pstmt.setInt(1, pid);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				return p;
			}
			
			} catch (Exception e) {
			System.err.println("Product Selection exception"+e);
			}
		return null;
			
		}
	
//	public int DropProduct(int pid) {
//		return pid;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb_phase2", "root", "Akriti123@");
////			Connection con=DbResource.getDbConnection();
//			 Statement stmt = con.createStatement();
//			 {
//				 String sql = "DROP DATABASE STUDENTS";
//		         stmt.executeUpdate(sql);
//		         System.out.println("Database dropped successfully...");   	  
//		      } catch (SQLException e) {
//		         e.printStackTrace();
//		      } 
		
			
		}
	
	

