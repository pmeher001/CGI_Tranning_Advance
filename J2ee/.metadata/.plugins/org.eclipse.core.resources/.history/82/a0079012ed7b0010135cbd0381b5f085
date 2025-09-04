package com.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
	
}
