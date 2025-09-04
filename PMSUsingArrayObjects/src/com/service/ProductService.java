package com.service;

import com.bean.Product;

public class ProductService {
	Product listOfProduct[] = new Product[10];
	public static int index=0;
	
	public String addProduct(Product product) {
		int temp=0;
			if(index==0) {
			listOfProduct[index]=product;
			index++;
			return "Product details stored successfully";
			}else {
				for(int i=0;i<index;i++) {
					 Product p = listOfProduct[i];
					 if(p.getPid()==product.getPid()) {
						 temp++;
						 break;
					 }
					}
			}
			
			if(temp==0) {
				listOfProduct[index]=product;
				index++;
				return "Product details stored successfully";
			}else {
				temp=0;
				return "Product id must be unique";
			}
		
	}
	public Product[] getAllProucts() {
		return listOfProduct;
	}
	// delete product using pid 
	// update product price using prid 
	// search product using pid 
	
}