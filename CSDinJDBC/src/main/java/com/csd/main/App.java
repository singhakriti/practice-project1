package com.csd.main;

import java.util.Scanner;

import com.csd.service.ProductService;
import com.csd.service.StudentService;

public class App {

	public static void main(String[] args) {
		int choice;
		String con="";
		Scanner sc = new Scanner(System.in);
		int pid;
		String pname;
		float price;
		String result;
		ProductService cs = new ProductService();
		StudentService ss = new StudentService();
		do {
			System.out.println("1:Select 2:Create DB 3:drop DB");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: System.out.println("Plz enter the pid");
	        pid = sc.nextInt();
	        result =cs.SelecteProduct(pid);
	        System.out.println(result);
		
		break;
			case 2: System.out.println("Creating new database: Student");

			ss.createStudent();
		
		break;
			case 3: System.out.println("Drop  database :Student");
			ss.dropStudent();
			break;
		
			default:System.out.println("Wrong choice");
			break;
	}
	System.out.println("Do you want to continue?");
	con = sc.next();
	
} while (con.equalsIgnoreCase("y"));

System.out.println("Thank you!");
		

	}

}
