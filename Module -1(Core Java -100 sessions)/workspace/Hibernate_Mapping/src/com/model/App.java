package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table ( name = "app_table")
public class App implements Serializable{
	
	@Id
	@GenericGenerator(name = "ref",strategy = "increment")
	@GeneratedValue(generator = "ref",strategy = GenerationType.IDENTITY)
	private int app_id;
	private String app_name;
	private double app_rating;
	private String app_size;
	
	public App() {
		// TODO Auto-generated constructor stub
	}

	public int getApp_id() {
		return app_id;
	}

	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}

	public String getApp_name() {
		return app_name;
	}

	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

	public double getApp_rating() {
		return app_rating;
	}

	public void setApp_rating(double app_rating) {
		this.app_rating = app_rating;
	}

	public String getApp_size() {
		return app_size;
	}

	public void setApp_size(String app_size) {
		this.app_size = app_size;
	}
	
	
}
