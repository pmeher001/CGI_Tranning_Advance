package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Product;
import com.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	// http://localhost:9090
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openIndexPage() { 
		
		return "index";
	}
	
	// http://localhost:9090/addProductPage
	@RequestMapping(value = "/addProductPage",method = RequestMethod.GET)
	public String openAddProductPage(Product product,Model model) { // DI for Product  and model
		model.addAttribute("product", product);// store product in model scope 
		model.addAttribute("msg", "Add Product");// store msg in model scope 
		return "addProduct";
	}
	
	@RequestMapping(value = "/storeProduct",method = RequestMethod.POST)
	public String stoeProductInDb(Product product,Model model) { // DI for Product  and model
		System.out.println(product);	// value get 
		String result = productService.storeProduct(product);	
		product.setPid(0);
		product.setPname("");
		product.setPrice(0.0f);
		model.addAttribute("product", product);// store product in model scope 
		model.addAttribute("msg", "Add Product");// store msg in model scope 
		model.addAttribute("result", result);   // result hold confirmation result of operation 
		return "addProduct";
	}
	
}
