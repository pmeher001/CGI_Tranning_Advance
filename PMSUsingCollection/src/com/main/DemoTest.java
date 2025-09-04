package com.main;

import java.util.List;
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
		System.out.println("1: Add Product 2 : View Product 3: Delete Product 4 : Update Product price 5 : Search Product ");
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
				List<Product> listOfProduct = ps.getAllProucts();
				for(Product product:listOfProduct) {
					System.out.println(product);  // call toString method 
				}
			break;	
		case 3 : System.out.println("Enter the product id");
		          pid = sc.nextInt();
		          result = ps.deleteProduct(pid);
		          System.out.println(result);
		      break;
		case 4 :System.out.println("Enter the product id");
				pid  = sc.nextInt();
				
				System.out.println("Enter the product price");
				price  = sc.nextFloat();
				
				Product p1 = new Product();
				p1.setPid(pid);
				p1.setPrice(price);
				result = ps.updateProductPrice(p1);
				System.out.println(result);
				break;
		case 5: System.out.println("Enter the product id");
				pid  = sc.nextInt();
				Product searchProduct = ps.findProduct(pid);
				if(searchProduct==null) {
					System.out.println("Product not present");
				}else {
					System.out.println(searchProduct);
				}
				break;
		default:System.out.println("Wrong choice");
				break;
		}
		System.out.println("Do you want to continue(y/n)");
		con = sc.next();
	} while (con.equalsIgnoreCase("y"));
	System.out.println("Thank you!");

	}

}