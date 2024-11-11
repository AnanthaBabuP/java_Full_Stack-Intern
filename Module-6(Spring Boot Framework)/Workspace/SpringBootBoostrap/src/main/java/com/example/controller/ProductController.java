package com.example.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.ProductRepository;
import com.example.model.ProductTable;

@Controller
public class ProductController {

	private ProductRepository dao;
	
	public ProductController(ProductRepository dao) {
		System.out.println("Controller Invoked...");
		this.dao = dao;
	}
	
	


	@RequestMapping("/")
	public ModelAndView homePage() {
		
		return new ModelAndView("Home").addObject("product", new ProductTable()).addObject("process", "Register");
	}

	@RequestMapping("/saveProduct")
	public ModelAndView saveProcess(ProductTable p) {
		System.out.println("Save Process");
		dao.save(p);
		return new ModelAndView("Home").addObject("product", new ProductTable()).addObject("process", "Register");
	}

	@RequestMapping("/viewAllProducts")
	public ModelAndView viewAllProducts() {
		List<ProductTable> products = (List<ProductTable>) dao.findAll();

		return new ModelAndView("ViewAllProducts").addObject("products", products);
	}
	
	@RequestMapping("/editProduct/{productId}")
	public ModelAndView deleteProcess(@PathVariable("productId") int pid, Model m) {
		return new ModelAndView("EditProduct").addObject("product", dao.findById(pid)).addObject("process", "Edit");
	}
	
	@RequestMapping("/updateProduct")
	public String updateProduct(ProductTable product) {
		dao.save(product);
		return "redirect:/viewAllProducts";
	}
	
	@RequestMapping("/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable("productId") int pid, Model m) {
		dao.deleteById(pid);
		return "redirect:/viewAllProducts";
	}
}
