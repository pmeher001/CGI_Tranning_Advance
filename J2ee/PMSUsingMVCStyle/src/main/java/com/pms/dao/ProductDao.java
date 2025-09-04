package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pms.bean.Product;
import com.pms.resource.DbResource;

public class ProductDao {

	public int storeProduct(Product product) {
		try {
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
		pstmt.setInt(1, product.getPid());
		pstmt.setString(2, product.getPname());
		pstmt.setFloat(3, product.getPrice());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public int deleteProduct(int pid) {
		try {
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("delete from product where pid=?");
		pstmt.setInt(1, pid);
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public int updateProductPrice(Product product) {
		try {
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("update product set price=? where pid=?");
		pstmt.setInt(2, product.getPid());
		pstmt.setFloat(1, product.getPrice());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public Product findProductById(int pid) {
		try {
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from product where pid=?");
		pstmt.setInt(1, pid);
		ResultSet rs  = pstmt.executeQuery();
		if(rs.next()) {
			Product p =new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getFloat(3));
			return p;
		}
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}
	
	public List<Product> findAllProducts() {
		List<Product> listOfProducts = new ArrayList<Product>();
		try {
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from product");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Product p = new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getFloat(3));
			listOfProducts.add(p);
		}
		} catch (Exception e) {
			System.err.println(e);
		}
		return listOfProducts;
	}
	
}