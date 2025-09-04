package com.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.bean.Product;

public class ProductService {
	//Product listOfProduct[] = new Product[10];
	//public static int index=0;
	List<Product> listOfProduct = new LinkedList<Product>();
	public String addProduct(Product product) {
			int temp=0;
			if(listOfProduct.size()==0) {
			listOfProduct.add(product);
			return "Product details stored successfully";
			}else {
				for(int i=0;i<listOfProduct.size();i++) {
					 Product p = listOfProduct.get(i);
					 if(p.getPid()==product.getPid()) {
						 temp++;
						 break;
					 }
					}
			}
			if(temp==0) {
				listOfProduct.add(product);
				return "Product details stored successfully";
			}else {
				temp=0;
				return "Product id must be unique";
			}
	}
	public List<Product> getAllProucts() {
		return listOfProduct;
	}
	// delete product using pid 
	public String deleteProduct(int pid) {
		int temp=0;
		Iterator<Product> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==pid) {
				li.remove();
				temp++;
				break;
			}
		}
		
		if(temp>0) {
			temp=0;
			return "Product details deleted successfully";
		}else {
			return "Product not present";
		}
		
	}
	// update product price using pid 
	public String updateProductPrice(Product product) {	// pid and price 
		int temp=0;
		Iterator<Product> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==product.getPid()) {
				p.setPrice(product.getPrice());  // replace with new price 
				temp++;
				break;
			}
		}
		
		if(temp>0) {
			temp=0;
			return "Product details updated successfully";
		}else {
			return "Product not present";
		}
		
	}
	// search product using pid 
	public Product findProduct(int pid) {	// pid and price 
	
		Iterator<Product> li = listOfProduct.iterator();
		while(li.hasNext()) {
			Product p = li.next();
			if(p.getPid()==pid) {
				return p;
			}
		}
		
		return null;
		
	}
	
}