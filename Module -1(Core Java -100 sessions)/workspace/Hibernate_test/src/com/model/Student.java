package com.model;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Student")
public class Student implements Serializable{
	
	@Id
	@GenericGenerator (name = "ref", strategy = "increment")
	@GeneratedValue(generator = "ref")
	private int stud_id;
	private String stud_name;
	private String stud_dep;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getStud_dep() {
		return stud_dep;
	}

	public void setStud_dep(String stud_dep) {
		this.stud_dep = stud_dep;
	}
	

}
