package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Product;

import org.hibernate.Transaction;

public class Application {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		System.out.println("file loaded successfully");
		SessionFactory sf = con.buildSessionFactory(); 
		Session session = sf.openSession();
		
		Product p1=new Product();
		p1.setId(1);
		p1.setName("Cake");
		p1.setPrice(2500);
		
		Transaction tran=session.getTransaction();
		tran.begin();
		
		session.save(p1);
		tran.commit();
		System.out.println("Record inserted successfully");

	}

}
