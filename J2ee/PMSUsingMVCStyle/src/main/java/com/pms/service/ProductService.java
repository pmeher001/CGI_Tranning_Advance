package com.pms.service;

import java.util.List;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;

public class ProductService {

	ProductDao pd = new ProductDao();
	
	public String storeProduct(Product product) {
		if(product.getPrice()<0) {
			return "Product price must be +ve";
		}else if(pd.storeProduct(product)>0) {
			return "Product details stored successfully";
		}else {
			return "Product not store";
		}
	}
	public String deleteProduct(int pid) {
		if(pd.deleteProduct(pid)>0) {
			return "Product details deleted successfully";
		}else {
			return "Product not present";
		}
	}
	public String updateProduct(Product product) {
		if(pd.updateProductPrice(product)>0) {
			return "Product details updated successfully";
		}else {
			return "Product not present";
		}
	}
	public String findProduct(int pid) {
		Product p = pd.findProductById(pid);
		if(p!=null) {
			return p.toString();
		}else {
			return "Product not present";
		}
	}
	
	public List<Product> findAllProducts() {
		return pd.findAllProducts();
	}
}