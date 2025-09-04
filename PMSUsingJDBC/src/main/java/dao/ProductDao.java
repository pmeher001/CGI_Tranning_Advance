package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Product;
import resource.DbResource;


public class ProductDao {

	public int storeProduct(Product product) {
		try {
	//	Class.forName("com.mysql.cj.jdbc.Driver");
	//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi_db", "root", "Password@1");
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
	
	public int updateProduct(Product product) {
		try {
	//		Class.forName("com.mysql.cj.jdbc.Driver");
	//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi_db1", "root", "root@123");
	Connection con = DbResource.getDbConnection();
	PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid=?");
	pstmt.setFloat(1, product.getPrice());	
	pstmt.setInt(2, product.getPid());
		return pstmt.executeUpdate();
			} catch (Exception e) {
				System.err.println(e);
				return 0;
			}
	}
	
	public int deleteProduct(int pid) {
		try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
	//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi_db1", "root", "root@123");
	Connection con = DbResource.getDbConnection();
	PreparedStatement pstmt = con.prepareStatement("delete from product where pid=?");
	pstmt.setFloat(1, pid);	
		return pstmt.executeUpdate();
			} catch (Exception e) {
				System.err.println(e);
				return 0;
			}

	}
	public Product findProduct(int pid) {
		try {
	//Class.forName("com.mysql.cj.jdbc.Driver");
	//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi_db1", "root", "root@123");
			Connection con = DbResource.getDbConnection();
	PreparedStatement pstmt = con.prepareStatement("select * from product where pid = ?");
	pstmt.setInt(1, pid);
	ResultSet rs = pstmt.executeQuery();
	if(rs.next()) {
		Product p = new Product();
		p.setPid(rs.getInt(1));
		p.setPname(rs.getString(2));
		p.setPrice(rs.getFloat(3));		// convert query record into object ie product 
		return p;
	}else {
		return null;
	}
			} catch (Exception e) {
				System.err.println(e);
			}
		return null;
	}
	
	public List<Product> findAllProducts() {
		List<Product> listOfProduct = new ArrayList<Product>();
		try {
	//Class.forName("com.mysql.cj.jdbc.Driver");
	//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi_db1", "root", "root@123");
	Connection con = DbResource.getDbConnection();
	PreparedStatement pstmt = con.prepareStatement("select * from product");
	
	ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
		Product p = new Product();
		p.setPid(rs.getInt(1));
		p.setPname(rs.getString(2));
		p.setPrice(rs.getFloat(3));		// convert query record into object ie product 
		listOfProduct.add(p);			// store in list/set/map of product 
	}
			} catch (Exception e) {
				System.err.println(e);
			}
		return listOfProduct;
	}
}