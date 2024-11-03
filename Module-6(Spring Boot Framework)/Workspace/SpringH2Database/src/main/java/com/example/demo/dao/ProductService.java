package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class ProductService {

	private ProductDAO dao;
	public ProductService(ProductDAO dao) {
		System.out.println("Done Service");
		this.dao = dao;
	}
	
	public void save(Product p) {
		dao.save(p);
	}

	public List<Product> viewAllProducts() {
		List<Product> allProducts = (List<Product>) dao.findAll();
		return allProducts;
	}

	public Product updateProduct(int pid) {

		return dao.findById(pid).get();
		
	}
}
