package com.pms.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pms.bean.Product;


public class ProductDao {
//	public List<Product> retrieveProduct() {
//		   List<Product> listOfProduct = new ArrayList<>();
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb_phase2", "root", "Akriti123@");
//			//Connection con=DbResource.getDbConnection();
//			PreparedStatement pstmt = con.prepareStatement("select * from product ");
//			
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				Product  p = new Product();			// converting query into product object. 
//				p.setPid(rs.getInt(1));
//				p.setPname(rs.getString(2));
//				p.setPrice(rs.getFloat(3));
//				listOfProduct.add(p);
//				
//			}
//			} catch (Exception e) {
//			     System.err.println("Product update exception"+e);
//				
//			}
//		return listOfProduct;
//		
//	}
	public Product findProduct(int pid) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb_phase2", "root", "Akriti123@");
			//Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from product where pid = ?");
			pstmt.setInt(1, pid);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Product  p = new Product();			// converting query into product object. 
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				return p;
				
			}
			} catch (Exception e) {
			     System.err.println("Product retrieve exception"+e);
				
			}
		return null;
		
	}

}

	

