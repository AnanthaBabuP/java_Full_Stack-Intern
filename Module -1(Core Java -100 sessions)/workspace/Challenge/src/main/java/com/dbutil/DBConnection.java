package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public DBConnection() { }
	
	private static Connection con = null;
	private static final String URL = "jdbc:mysql://localhost:3306/cultural_festival_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Ananth@1999";
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

}
