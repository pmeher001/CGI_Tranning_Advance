package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded...");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi_db", 
			"root", "Password@1");
	System.out.println("connected");
	//Statement stmt = con.createStatement();
	//System.out.println("Statement object created..");
	
	// Retrieve Query 
//	ResultSet rs= stmt.executeQuery("select * from employee");
//		while(rs.next()) {
//		System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//		}
//		
//		rs.close();
	
	
		// insert query 
//		int temp = stmt.executeUpdate("insert into employee values(104,'Ajay',48000)");
//		if(temp>0) {
//			System.out.println("record inserted successfully");
//		}
	
	
	// update query 
//	int temp = stmt.executeUpdate("update employee set salary=52000 where id=100");
//	if(temp>0) {
//		System.out.println("record updated successfully");
//	}else {
//		System.out.println("record not preset");
//	}

	// delete query 
//	int temp = stmt.executeUpdate("delete from employee where id = 101");
//	if(temp>0) {
//		System.out.println("record deleted successfully");
//	}else {
//		System.out.println("record not preset");
//	}
//	
//		stmt.close();
	
		Scanner sc = new Scanner(System.in);
		
		// insert record using prepared statement 
	
		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
		System.out.println("Enter the id");
		int id = sc.nextInt();
			pstmt.setInt(1, id);
		
		System.out.println("Enter the name");
		String name = sc.next();
			pstmt.setString(2, name);
		
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
			pstmt.setFloat(3, salary);
		
		int temp = pstmt.executeUpdate();
		if(temp>0) {
			System.out.println("Record inserted");
		}
		
		
		pstmt.close();
		con.close();
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}