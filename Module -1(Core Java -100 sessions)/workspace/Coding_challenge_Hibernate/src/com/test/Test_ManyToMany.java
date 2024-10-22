package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Company;
import com.model.Product;

public class Test_ManyToMany {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Company.class)
				.addAnnotatedClass(Product.class);

		try (SessionFactory factory = cfg.buildSessionFactory(); Session session = factory.openSession()) {

			Transaction tx = session.beginTransaction();

			// Create Products
			Product product1 = new Product();
			product1.setProductName("Smartphone");
			product1.setProductPrice(50000);

			Product product2 = new Product();
			product2.setProductName("Laptop");
			product2.setProductPrice(80000);

			List<Product> listProduct1 = new ArrayList<>();
			listProduct1.add(product1);
			listProduct1.add(product2);

			// Create Company
			Company company = new Company();
			company.setCompanyName("Tech Corp");

			// Add Products to Company
			company.setProducts(listProduct1);

			List<Company> listCompany = new ArrayList<>();
			listCompany.add(company);
			listCompany.add(company);

			// Add Company to Products
			product1.setCompanies(listCompany);

			// Save the Company (Cascades to Products)
			session.save(company);

			tx.commit();
			System.out.println("Records saved successfully.");
		}
	}
}
