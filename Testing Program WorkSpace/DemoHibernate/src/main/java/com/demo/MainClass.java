package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainClass {
	private static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("http:mysql://localhost:3306/mydb", "rrot","Ananth@1999");
			if(con != null) {
				System.out.println("Connection Sucessfully...");
			} else
				System.out.println("Connection Failled...");
			
			Statement smt = con.createStatement();
			ResultSet rs =  smt.executeQuery("Select * FRom Student");
			
			while(rs.next()) {
				System.out.println(rs.getInt(0));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
