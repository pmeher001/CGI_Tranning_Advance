package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

@Repository
public class ProductDao {

	@Autowired
	EntityManagerFactory emf;
	
	public int storeProduct(Product product) {
		try {
			EntityManager manager = emf.createEntityManager();
			EntityTransaction tran = manager.getTransaction();
			tran.begin();
				manager.persist(product);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<Product> findAllProducts() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select p from Product p");
		List<Product> listOProduct = qry.getResultList();
		return listOProduct;
	}
}
