package com.model;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{
	/**
	 * Rules For Declaration
	 */
	
	private int regno;
	private String student_name;
	private int age;
	private String gender;
	private String dept;
	private Date dob;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
