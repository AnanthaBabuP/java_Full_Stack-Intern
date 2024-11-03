package com.example.demo.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ProductService;
import com.example.demo.model.Product;


@Controller
public class MainController {

	private ProductService service;

	public MainController(ProductService service) {
		System.out.println("Front-controller Invoked..");
		this.service = service;
	}

	@RequestMapping("/")
	public String homePage() {
		return "Home";
	}

	@RequestMapping("/saveProduct")
	public String saveProcess(Product p) {
		service.save(p);
		return "Home";
	}

	@RequestMapping("/viewAllProducts")
	public ModelAndView viewAllProducts() {
		List<Product> products = service.viewAllProducts();
		for (Product p : products) {
			System.out.println("Product Id : " + p.getId());
			System.out.println("Product Name : " + p.getPname());
			System.out.println("Product Quantity : " + p.getQuantity());
			System.out.println("Product Price : " + p.getPrice());
		}
		return new ModelAndView("ViewAllProducts").addObject("products", products);
	}
	
	@RequestMapping("/editProduct/{productId}")
	public String deleteProcess(@PathVariable("productId") int pid, Model m) {
		m.addAttribute("protect", service.updateProduct(pid));
		return "EditRegister";
	}

}
