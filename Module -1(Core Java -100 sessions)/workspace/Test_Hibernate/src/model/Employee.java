package model;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int empid;
	private String empName;
	private int age;
	
	public Employee() {}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
