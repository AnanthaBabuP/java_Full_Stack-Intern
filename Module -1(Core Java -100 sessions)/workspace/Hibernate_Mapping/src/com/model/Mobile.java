package com.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "mobile_table")
public class Mobile implements Serializable{
	
	@Id
	@GenericGenerator(name = "ref",strategy = "increment")
	@GeneratedValue(generator = "ref",strategy = GenerationType.IDENTITY)
	private int mobile_id;
	
	private String mobile_company;
	private String mobile_name;
	private Double mobile_price;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="mobile_id")
	private Collection<App> apto;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public int getMobile_id() {
		return mobile_id;
	}

	public void setMobile_id(int mobile_id) {
		this.mobile_id = mobile_id;
	}

	public String getMobile_company() {
		return mobile_company;
	}

	public void setMobile_company(String mobile_company) {
		this.mobile_company = mobile_company;
	}

	public String getMobile_name() {
		return mobile_name;
	}

	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}

	public Double getMobile_price() {
		return mobile_price;
	}

	public void setMobile_price(Double mobile_price) {
		this.mobile_price = mobile_price;
	}
	
	public Collection<App> getApto() {
		return apto;
	}	
	
	public void setApto(Collection<App> apto) {
		this.apto = apto;
	}
}
