package com.main;

import java.util.Scanner;

import com.bean.Product;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String con="";
	int pid;
	String pname;
	float price;
	String result = "";
	ProductService ps = new ProductService();
	do {
		System.out.println("1: Add Product 2 : View Product");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:	System.out.println("Enter the product id");
				pid  = sc.nextInt();
				System.out.println("Enter the product pname");
				pname  = sc.next();
				System.out.println("Enter the product price");
				price  = sc.nextFloat();
				Product p = new Product(pid, pname, price);
				result = ps.addProduct(p);
				System.out.println(result);
				break;
				
		case 2: System.out.println("All Product details ");
				Product allProduct[]= ps.getAllProucts();
				if(ProductService.index==0) {
					System.out.println("No Product are present");
				}else {
					for(int i=0;i<ProductService.index;i++) {
					 Product product = allProduct[i];
					 System.out.println(product);
					}
				}
			break;	
		default:
			break;
		}
		System.out.println("Do you want to continue(y/n)");
		con = sc.next();
	} while (con.equalsIgnoreCase("y"));
	System.out.println("Thank you!");

	}

}