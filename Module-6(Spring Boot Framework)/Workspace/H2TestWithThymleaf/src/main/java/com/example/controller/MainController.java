package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.DAO.ProductRepository;
import com.example.model.Product;

@RestController
public class MainController {

	private ProductRepository dao;
	
	public MainController(ProductRepository dao) {
		this.dao = dao;
	}
	
	 @GetMapping("/")
	public ModelAndView homePage() {
		return new ModelAndView("Register").addObject("product", new Product());
	}
	
	@PostMapping(path = "/register")
	public Product RegisterProduct(@ModelAttribute Product products) {
		System.out.println(products.toString());
		return dao.save(products);
	}
	
	@GetMapping(path =  "/products",produces = "application/json")
	public Iterable<Product> showAllProducts() {
		System.out.println("DONE");
		return dao.findAll();
	}
	
	@GetMapping(path = "/products/{id}")
	public Product findById(@PathVariable int id) {
		return dao.findById(id).orElse(null);
	}
	
	@PutMapping(path = "/product/")
	public Product updateProduct(@RequestBody Product prd) {
		return dao.save(prd);
	}
	
	@DeleteMapping(path = "/product/{id}")
	public String deleteProduct(@PathVariable int id) {
		dao.deleteById(id);
		return "Deleted Successfully";
	}
}
