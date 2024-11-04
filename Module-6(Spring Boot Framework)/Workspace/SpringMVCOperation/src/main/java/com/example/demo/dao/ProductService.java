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

	public Product findProduct(int pid) {
		return dao.findById(pid).get();
	}
	
	public void updateProduct(Product p) {
		
		Product p2 = dao.findById(p.getId()).get();
		p2.setPname(p.getPname());
		p2.setQuantity(p.getQuantity());
		p2.setPrice(p.getPrice());
		dao.save(p2);
	}

	public void deleteProduct(int pid) {
		dao.deleteById(pid);
	}

	public List<Product> findProductByname(String name) {
		List<Product> product = dao.findBypname(name);
		return product;
	}

	public List<Product> findProductByQuantity(int gty) {
		List<Product> product = dao.findByquantity(gty);
		return product;
	}
	
	public List<Product> findProductByQuantityGreaterThen(int gty) {
		List<Product> product = dao.findByquantityGreaterThan(gty);
		return product;
	}
}
