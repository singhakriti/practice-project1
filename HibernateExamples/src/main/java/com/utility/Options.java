package com.utility;

import java.util.List;
import java.util.Scanner;

import com.entity.Student;
import com.entity.Trainer;
import com.service.StudentService;
import com.service.TrainerService;


public class Options {
	static Scanner sc=new Scanner(System.in);
	public static void studentOption() {
		int choice;
		String con="";
		int sid;
		int age;
		int tsid;
		String sname;
		StudentService ss=new StudentService();
		TrainerService ts=new TrainerService();
		String result;
		do {
			System.out.println("Student Options");
			System.out.println("1:Add 2:findAllStudents");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter Student id");
		       sid=sc.nextInt();
		       System.out.println("Enter Student name");
		       sname=sc.next();
		       System.out.println("Enter Student age");
		       age=sc.nextInt();
		       List<Trainer> listOfTrainer=ts.findAllTrainer();
		       for (Trainer t:listOfTrainer) {
		    	   System.out.println("Trainer is "+t.getTid());
		       }
		       System.out.println("Enter trainer id");
		       tsid=sc.nextInt();
		       Student s1 = new Student(sid, sname, age,tsid);
			      result = ss.storeStudent(s1);
			      System.out.println(result);
				break;
			case 2:List<Student>listOfStudent=ss.findAllStudents();
			       for(Student s:listOfStudent) {
			       System.out.println(s); 
			       }//override to string method	
				break;
				default:
				break;	
			}
			
		System.out.println("Do you want to continue?");	
		con=sc.next();
		}while(con.equals("y"));
			
	}
}
