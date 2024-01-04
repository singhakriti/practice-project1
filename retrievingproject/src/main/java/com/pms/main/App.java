package com.pms.main;

import java.util.List;
import java.util.Scanner;

import com.pms.bean.Product;
import com.pms.service.ProductService;

public class App {

	public static void main(String[] args) {
		int pid;
		String pname;
		Scanner sc = new Scanner(System.in);
		float price;
		String result;
		ProductService ps = new ProductService();
		System.out.println("please enter pid");
        pid=sc.nextInt();
        result =ps.findProduct(pid);
        System.out.println(result);
//		List<Product> listOfProduct = ps.findAllProduct();
//        for(Product p : listOfProduct) {
//	    System.out.println(p);   // it will call toString method
        }
	}


