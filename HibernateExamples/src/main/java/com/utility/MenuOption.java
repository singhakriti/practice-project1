package com.utility;

import java.util.List;
import java.util.Scanner;

import com.entity.Trainer;
import com.service.TrainerService;



public class MenuOption {
	static Scanner sc=new Scanner(System.in);
	public static void traineMenuOption() {
		int choice;
		String con="";
		int tid;
		String tname;
		TrainerService ts=new TrainerService();
		String result;
		do {
			System.out.println("Trainer Menu");
			System.out.println("1:Add 2:Delete 3:Update 4:find 5:Retrive All trainer 6:find all trainer names 7:All trainer  id and name");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter trainer id");
			       tid=sc.nextInt();
			       System.out.println("Enter Trainer name");
			       tname=sc.next();
			       Trainer t1=new Trainer(tid,tname);
			       result = ts.storeTrainer(t1);
			       System.out.println(result);
				break;
			case 2:System.out.println("Enter trainer id");
		           tid=sc.nextInt();
		           result = ts.deleteTrainer(tid);
		           System.out.println(result);
				break;
			case 3:System.out.println("Enter trainer id");
		           tid=sc.nextInt();
		           System.out.println("Enter Trainer name");
		           tname=sc.next();
		           Trainer t2=new Trainer(tid,tname);
		           result = ts.updateTrainer(t2);
		           System.out.println(result);
				break;
			case 4:System.out.println("Enter trainer id");
	           tid=sc.nextInt();
	           result = ts.findTrainer(tid);
	           System.out.println(result);
				break;
			case 5:List<Trainer>trainers=ts.findAllTrainer();
			       for (Trainer t : trainers) {
			    	   System.out.println(t);
			       }
				break;
			case 6:List<String>listOfNames=ts.findAllTrainerNames();
		       for (String name : listOfNames) {
		    	   System.out.println(name);
		       }
				break;
			case 7:List<Object[]>listOfIdAndName=ts.findAllTrainerIdAndNames();
		       for (Object[] obj : listOfIdAndName) {
		    	   System.out.println("id is" + obj[0] + "Name is "+obj[1]);
		       }
				break;
				default:
				break;	
			}
		System.out.println("Do you want to continue?");	
		con=sc.next();
		}while(con.equals("y"));
			
	}

}
