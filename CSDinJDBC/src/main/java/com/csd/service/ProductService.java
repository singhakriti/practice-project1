package com.csd.service;
import com.csd.dao.ProductDao;
import com.csd.bean.Product;
public class ProductService {
	
	ProductDao pd = new ProductDao();

		public String SelecteProduct(int id) {
			Product p = pd.SelecteProduct(id);
			if (p==null) {
				return"Product is not present";
			}else {
				return p.toString();
			}
	}
	
}

	


	
	


