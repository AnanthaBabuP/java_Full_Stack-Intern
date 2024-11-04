package com.example.demo.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
//		for (Product p : products) {
//			System.out.println("Product Id : " + p.getId());
//			System.out.println("Product Name : " + p.getPname());
//			System.out.println("Product Quantity : " + p.getQuantity());
//			System.out.println("Product Price : " + p.getPrice());
//		}
		return new ModelAndView("ViewAllProducts").addObject("products", products);
	}
	
	@RequestMapping("/editProduct/{productId}")
	public String deleteProcess(@PathVariable("productId") int pid, Model m) {
		m.addAttribute("product", service.findProduct(pid));
		return "EditRegister";
	}
	
	@RequestMapping("/updateProduct")
	public String updateProduct(@ModelAttribute("product") Product product) {
		System.out.println("Here Controller");
		service.updateProduct(product);
		return "redirect:/viewAllProducts";
	}
	
	@RequestMapping("/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable("productId") int pid, Model m) {
		service.deleteProduct(pid);
		return "redirect:/viewAllProducts";
	}
	
	@RequestMapping("/name/{name}")
	public String findByName(@PathVariable("name") String name, Model m) {
		List<Product> p = service.findProductByname(name);
		for(Product pro:p) {
			System.out.println("Find By Name");
			System.out.println("Product id :"+pro.getId());
			System.out.println("Product name :"+pro.getPname());
			System.out.println("Product Quantity :"+pro.getQuantity());
			System.out.println("Product Price :"+pro.getPrice());
		}
		m.addAttribute("record", p);
		return "display";
	}
	
	@RequestMapping("/gty/{gty}")
	public String findByProductQuantity(@PathVariable("gty") int gty, Model m) {
		List<Product> p = service.findProductByQuantity(gty);
		for(Product pro:p) {
			System.out.println("Find By Quentity");
			System.out.println("Product id :"+pro.getId());
			System.out.println("Product name :"+pro.getPname());
			System.out.println("Product Quantity :"+pro.getQuantity());
			System.out.println("Product Price :"+pro.getPrice());
		}
		m.addAttribute("record", p);
		return "display";
	}
	
	@RequestMapping("/gt/{gty}")
	public String findByProductQuantityGT(@PathVariable("gty") int gty, Model m) {
		List<Product> p = service.findProductByQuantityGreaterThen(gty);
		for(Product pro:p) {
			System.out.println("Find Greater then : "+gty);
			System.out.println("Product id :"+pro.getId());
			System.out.println("Product name :"+pro.getPname());
			System.out.println("Product Quantity :"+pro.getQuantity());
			System.out.println("Product Price :"+pro.getPrice());
		}
		m.addAttribute("record", p);
		return "display";
	}


}
