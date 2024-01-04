package com.pms.service;
import java.util.Iterator;
//import java.util.List;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;

public class ProductService {

	ProductDao pd = new ProductDao();
//	public List<Product> findAllProduct() {
//		
//		Iterator<Product> li =listOfProduct.iterator();
//		while(li.hasNext()) {
//			Product p = li.next();
//			float discount =0.10f*p.getPrice();	// 6500 
//			p.setPrice(p.getPrice()-discount);
//		}
//		
//		return listOfProduct;
//	}
	public String findProduct(int id) {
		Product p = pd.findProduct(id);
		if (p==null) {
			return"Product is not present";
		}else {
			return p.toString();
		}
		
	}
}