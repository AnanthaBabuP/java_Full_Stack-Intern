package com.Sample;

import java.util.Scanner;

public class Employee {
	
	String name;
	String Desigination;
	double salary;
	
	void getEmployee(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter Employee Name");
		name = s.next();
		System.out.println("Enter Employee Desigination");
		Desigination  = s.next();
		System.out.println("Enter Employee Slaary");
		salary = s.nextDouble();
		
		s.close();
	}
	void printEmployee(){
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Desigination:"+Desigination);
		System.out.println("Employee Salary:"+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.getEmployee();
		emp.printEmployee();
	}

}
