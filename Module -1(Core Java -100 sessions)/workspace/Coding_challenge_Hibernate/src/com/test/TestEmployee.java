package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.dao.EmployeeDAO;
import com.model.Employee;

public class TestEmployee {

	private static EmployeeDAO dao = new EmployeeDAO();
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// Print The Process Details
		System.out.println("\t\tPROCESS");
		System.out.println("***************************************************************");
		System.out.println("1. Persisting the class to database");
		System.out.println("2. Retriving records from database");
		System.out.println("3. Deleting record(condition:wheredeptnois30)");
		System.out.println("4. Updating record(Condition:Wheresalis8000,updatesalto11000)");
		System.out.println("***************************************************************");

		TestEmployee test = new TestEmployee();
		// Create the Scanner class to get User Input for Processing
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Process No: ");
		int process = scan.nextInt();

		// Check the process using Switch Case
		switch (process) {
		case 1:
			test.saveProcess();
			break;

		case 2:
			test.retriveEmployeeDetails();
			break;
		case 3:
			test.deleteEmployeeDetailById();
			break;
		case 4:
			test.updateSalaryEmployee();
			break;

		default:
			System.err.println("Invalid Process");
		}
		scan.close();
	}

	/**
	 * Persisting the class to database
	 */
	private void saveProcess() {
		try {

			// New Process Inserting Using User Input
			System.out.println("Enter The Number Of Records :");
			int count = scan.nextInt();
			Collection<Employee> empList = new ArrayList<Employee>();
			if (count != 0) {

				for (int i = 0; i < count; i++) {
					Employee emp = new Employee();

					System.out.println("\nEnter The UserName:");
					String name = scan.next();
					emp.setEname(name);

					System.out.println("Enter The Jop :");
					emp.setJob(scan.next());

					System.out.println("Enter The Salary :");
					emp.setSal(scan.nextInt());

					System.out.println("Enter The Department No :");
					emp.setDeptno(scan.nextInt());

					empList.add(emp);
				}

				dao.saveEmployee(empList);
			} else {
				System.err.println("Invalid Entity!...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Retrieving records from database
	 */
	private void retriveEmployeeDetails() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Enter The Employee Id : ");
			long empid = scan.nextInt();

			Employee emp = dao.getEmployeeById(empid);
			if (emp != null) {
				System.out.println("\n\tEmployee Details\n" + "Empployee Id      : " + emp.getEmpno() + "\n"
						+ "Empployee Name    : " + emp.getEname() + "\n" + "Empployee Jop     : " + emp.getJob() + "\n"
						+ "Empployee Salary  : " + emp.getSal() + "\n" + "Empployee Dept No : " + emp.getDeptno());
			} else {
				System.err.println("\nEmployee Not Found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
	}

	/**
	 * Deleting record(condition:wheredeptnois30)
	 */
	private void deleteEmployeeDetailById() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Enter Dept No To Delete : ");
			int deptno = scan.nextInt();

			dao.deleteEmployeeById(deptno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
	}

	/**
	 * Updating record(Condition:Wheresalis8000,updatesalto11000)
	 */
	public void updateSalaryEmployee() {
		try {
			System.out.println("\t Update Salary Details :");
			System.out.println("Enter Current Salary From Employee");
			int fromSalary = scan.nextInt();
			System.out.println("Enter New Salary From Employee");
			int toSalary = scan.nextInt();

			dao.updateSalary(fromSalary, toSalary);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
