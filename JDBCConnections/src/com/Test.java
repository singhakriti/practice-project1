package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded successfully");
   				Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root" ,"Akriti123@");
				System.out.println("Connection Successfully");
				Statement stmt=con.createStatement();
				System.out.println("Statement created..	");
				
				
		        int result=stmt.executeUpdate("insert into employee values(7,'Ramesh',349876)");
				if(result>0) {
					System.out.println("Record insert successfully");
				}
			}
			catch(Exception e){
				System.out.println(e);// to string method to display exception
				
			}
		// TODO Auto-generated method stub

	}

}
