package com.test;

import java.util.Scanner;

import com.dao.StudentDAO;
import com.model.Student;

public class Test_Student {

	StudentDAO dao = new StudentDAO();

	public static void main(String[] args) {
		try {
			// Create Scanner Class to Get User Input
			Scanner scan = new Scanner(System.in);
			
			// Enter The Student Details
			System.out.println("\t ***Enter The Student Details***");
			System.out.println("Enter the Student Name : ");
			String name = scan.next();
			System.out.println("Enter the Student Dept : ");
			String dept = scan.next();

			// Set Values for Student Object
			Student std = new Student();
			std.setStud_name(name);
			std.setStud_dep(dept);

			// Call to Student DAO File
			StudentDAO.saveStudent(std);

			// Close The Session
			scan.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
