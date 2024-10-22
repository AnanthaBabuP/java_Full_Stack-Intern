package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.EmployeeDAO;
import com.model.Employee;

public class TestHQL {
	EmployeeDAO dao = new EmployeeDAO();
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// Print The Process Details
		System.out.println("\t\tPROCESS");
		System.out.println("***************************************************************");
		System.out.println("1. Retrieving the records based on Employeename Starts with letter");
		System.out.println("2. Retrieving the records whose salary in between i1 to i2");
		System.out.println("3. Retrieving 2nd minimum and 2ndmaximum salaries");
		System.out.println("4. Writean SQLquery to fetch the list of employees with the same salary and update\n"
				+ "   The list of employee salary to 5000");
		System.out.println("***************************************************************");

		TestHQL test = new TestHQL();

		// Create the Scanner class to get User Input for Processing
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Process No: ");
		int process = scan.nextInt();

		// Check the process using Switch Case
		switch (process) {
		case 1:
			test.getEmployeeToStartingLetter();
			break;

		case 2:
			test.getEmployeesWithSalaryBetween5000And7000();
			break;
		case 3:
			test.getSecondMinAndMaxSalaries();
			break;
		case 4:
			test.updateSameSalaryEmployeeTo5000();
			break;

		default:
			System.err.println("Invalid Process");
		}
		scan.close();
	}

	/**
	 * List Of Data Start With A Letter
	 */
	private void getEmployeeToStartingLetter() {
		try {

			ArrayList<Employee> empList = dao.getEmployeeByFirstChar();
			if (!empList.isEmpty()) {
				System.out.println("\t****List Of Data Startion With A Letter****");
				for (Employee emp : empList) {
					System.out.println("\tEmployee Details\n" + "Empployee Id      : " + emp.getEmpno() + "\n"
							+ "Empployee Name    : " + emp.getEname() + "\n" + "Empployee Jop     : " + emp.getJob()
							+ "\n" + "Empployee Salary  : " + emp.getSal() + "\n" + "Empployee Dept No : "
							+ emp.getDeptno() + "\n");
				}
			} else {
				System.err.println("Racord Not Found..");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * List Of Employees With Salary Between 5000 And 7000
	 */
	private void getEmployeesWithSalaryBetween5000And7000() {
		try {

			ArrayList<Employee> empList = dao.getEmployeesWithSalaryBetween5000And7000();
			if (!empList.isEmpty()) {
				System.out.println("\t****List Of Employees With Salary Between 5000 And 7000****");
				for (Employee emp : empList) {
					System.out.println("\tEmployee Details\n" + "Empployee Id      : " + emp.getEmpno() + "\n"
							+ "Empployee Name    : " + emp.getEname() + "\n" + "Empployee Jop     : " + emp.getJob()
							+ "\n" + "Empployee Salary  : " + emp.getSal() + "\n" + "Empployee Dept No : "
							+ emp.getDeptno() + "\n");
				}
			} else {
				System.err.println("Racord Not Found..");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Second Min And Max Salaries
	 */
	private void getSecondMinAndMaxSalaries() {
		try {

			List<Integer> salList = dao.getSecondMinAndMaxSalaries();
			if (salList.size() >= 2) {
				System.out.println("\t****Second Min And Max Salaries****");
				System.out.println("Second Min Salary :" + salList.get(1));
				System.out.println("Second Max Salary :" + salList.get(salList.size() - 2));
			} else {
				System.out.println("Racord Not Found..");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Update Same Salary Employee To 5000
	 */
	private void updateSameSalaryEmployeeTo5000() {
		try {
			dao.updateEmployeesWithSameSalaryTo5000();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
