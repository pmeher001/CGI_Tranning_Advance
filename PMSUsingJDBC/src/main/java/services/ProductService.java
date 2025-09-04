package services;


import java.util.Iterator;
import java.util.List;

import bean.Product;
import dao.ProductDao;


public class ProductService {
	ProductDao pd = new ProductDao();
	
	public String storeProduct(Product product) {
		
		if(product.getPrice()<0) {			// simple business logic 
			return "Product price must be +Ve";
		}else if(pd.storeProduct(product)>0) {
			return "Product stored successfully";
		}else {
			return "Product didn't store";
		}
	}
	
	public Product findProduct(int pid) {
		return pd.findProduct(pid);
	}
	
	public String deleteProduct(int pid) {
		if(pd.deleteProduct(pid)>0) {
			return "Product deletd successfully";
		}else {
			return "Product not present";
		}
	}
	
	public String updateProduct(Product product) {
		if(pd.updateProduct(product)>0) {
			return "Product updated successfully";
		}else {
			return "Product not present";
		}
	}
	
	public List<Product> findAllProduct() {
		List<Product> listOfProducts = pd.findAllProducts();
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p =li.next();
			float discount = p.getPrice()*0.10f;
			p.setPrice(p.getPrice()-discount);
		}
		return listOfProducts;
	}
}