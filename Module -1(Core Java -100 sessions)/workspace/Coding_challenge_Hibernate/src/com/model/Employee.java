package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

// Add Annotation
@Entity
@Table(name = "Employee")
// 1. Implements Serializable interface
public class Employee implements Serializable {

	/**
	 * 2. Declare all Variable in private
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "ref", strategy = "increment")
	@GeneratedValue(generator = "ref", strategy = GenerationType.IDENTITY)
	private long empno;
	private String ename;
	private int sal;
	private String job;
	private int deptno;

	// 3. Create Default Constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// 4. Create Getter/ Setter/ both Methods
	public long getEmpno() {
		return empno;
	}

	public void setEmpno(long empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

}
