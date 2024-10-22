package com.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "company")
public class Company implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int companyId;

	private String companyName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "company_product", joinColumns = @JoinColumn(name = "company_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
	private List<Product> products;

	// Constructors, Getters, and Setters
	public Company() {
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
