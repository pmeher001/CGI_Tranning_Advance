package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public String storeProduct(Product product) {
		if(productRepository.existsById(product.getPid())) {
			return "Product id must be unique";
		}else {
			productRepository.save(product);
			return "Product stored";
		}
	}
	
	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}
}
