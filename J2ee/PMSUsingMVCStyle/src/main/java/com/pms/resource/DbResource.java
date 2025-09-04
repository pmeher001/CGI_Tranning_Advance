package com.pms.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {
private final static String driverName="com.mysql.cj.jdbc.Driver";
private final static String url="jdbc:mysql://localhost:3306/cgi_db";
private final static String userName="root";
private final static String password ="Password@1";
private static Connection con;
	// this block load only once 
	static {
		try {
			if(con==null) {
				Class.forName(driverName);
				con = DriverManager.getConnection(url, userName, password);
			}
		} catch (Exception e) {
				System.err.println("While creating connection "+e);
		}
	}
	
	public static Connection getDbConnection() {
		try {
			return con;
		} catch (Exception e) {
			System.err.println("while accessing the connection "+e);
			return null;
		}
	}
	
	public static void closeConection() {
		try {
			con.close();
		} catch (Exception e) {
			System.err.println("close the connection "+e);
		}
	}
}
