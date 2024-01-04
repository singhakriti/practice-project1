package com.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class App {

	public static void main(String[] args) {
		// we need to load the xml file
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		System.out.println("file loaded successfully");
		SessionFactory sf = con.buildSessionFactory(); //like a connection con(like a interface it is used  to create more than one object)
		Session session = sf.openSession(); ///like a statement as well as prepared statement
		
//		//now we create entity class object 
//		Employee emp1=new Employee();
//		emp1.setId(105);
//		emp1.setName("Hemant");
//		emp1.setSalary(25000);
//		
//		//create transaction object
//		Transaction tran=session.getTransaction();
//		tran.begin();
//		
//		session.save(emp1);
//		tran.commit();
//		System.out.println("Record inserted successfully");
		
		
//		Delete Query
//		Employee emp2=session.find(Employee.class,100); // select * from employee where id=100;
//		if(emp2==null) {
//			System.out.println("Record not present");
//		}else {
//			Transaction tran=session.getTransaction();
//			tran.begin();
//			session.delete(emp2);
//			tran.commit();
//			System.out.println("Record delete successfully");
//		}
		
        //Update Query 
//		
//		Employee emp2=session.find(Employee.class,101); // select * from employee where id=100;
//		if(emp2==null) {
//			System.out.println("Record not present");
//		}else {
//			Transaction tran=session.getTransaction();
//			tran.begin();
//			
//			 emp2.setSalary(14500);
//			 session.update(emp2);
//			
//			tran.commit();
//			System.out.println("Record update successfully");
//		}
		
		//retrive Query
		Employee emp2=session.find(Employee.class,101); // select * from employee where id=100;
		if(emp2==null) {
			System.out.println("Record not present");
		}else {
			System.out.println(emp2);  //call to string method
		}
		
	}

}
