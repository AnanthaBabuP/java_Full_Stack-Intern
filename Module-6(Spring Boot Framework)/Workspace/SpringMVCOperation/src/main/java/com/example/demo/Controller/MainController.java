package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ProductDAO;
import com.example.demo.dao.ProductService;
import com.example.demo.model.Product;

@Controller
public class MainController {

	private ProductDAO dao;

	public MainController(ProductDAO dao) {
		System.out.println("Spring MVCOperation Front-controller Invoked..");
		this.dao = dao;
	}

	@RequestMapping("/")
	public String homePage() {
		return "Home";
	}

	@RequestMapping("/saveProduct")
	public String saveProcess(Product p) {
		dao.save(p);
		return "Home";
	}

	@RequestMapping("/viewAllProducts")
	@ResponseBody
	public Iterable<Product> viewAllProducts() {
		return dao.findAll();
	}

	@RequestMapping("/{pid}")
	@ResponseBody
	public Optional<Product> viewOneProduct(@PathVariable("pid") int pid) {
		return dao.findById(pid);
	}
	@RequestMapping("/editProduct/{productId}")
	public String deleteProcess(@PathVariable("productId") int pid, Model m) {
		m.addAttribute("product", dao.findById(pid));
		return "EditRegister";
	}

	/*
	 * @RequestMapping("/updateProduct") public String
	 * updateProduct(@ModelAttribute("product") Product product) {
	 * System.out.println("Here Controller"); service.updateProduct(product); return
	 * "redirect:/viewAllProducts"; }
	 * 
	 * @RequestMapping("/deleteProduct/{productId}") public String
	 * deleteProduct(@PathVariable("productId") int pid, Model m) {
	 * service.deleteProduct(pid); return "redirect:/viewAllProducts"; }
	 * 
	 * @RequestMapping("/name/{name}") public String
	 * findByName(@PathVariable("name") String name, Model m) { List<Product> p =
	 * service.findProductByname(name); for(Product pro:p) {
	 * System.out.println("Find By Name");
	 * System.out.println("Product id :"+pro.getId());
	 * System.out.println("Product name :"+pro.getPname());
	 * System.out.println("Product Quantity :"+pro.getQuantity());
	 * System.out.println("Product Price :"+pro.getPrice()); }
	 * m.addAttribute("record", p); return "display"; }
	 * 
	 * @RequestMapping("/gty/{gty}") public String
	 * findByProductQuantity(@PathVariable("gty") int gty, Model m) { List<Product>
	 * p = service.findProductByQuantity(gty); for(Product pro:p) {
	 * System.out.println("Find By Quentity");
	 * System.out.println("Product id :"+pro.getId());
	 * System.out.println("Product name :"+pro.getPname());
	 * System.out.println("Product Quantity :"+pro.getQuantity());
	 * System.out.println("Product Price :"+pro.getPrice()); }
	 * m.addAttribute("record", p); return "display"; }
	 * 
	 * @RequestMapping("/gt/{gty}") public String
	 * findByProductQuantityGT(@PathVariable("gty") int gty, Model m) {
	 * List<Product> p = service.findProductByQuantityGreaterThen(gty); for(Product
	 * pro:p) { System.out.println("Find Greater then : "+gty);
	 * System.out.println("Product id :"+pro.getId());
	 * System.out.println("Product name :"+pro.getPname());
	 * System.out.println("Product Quantity :"+pro.getQuantity());
	 * System.out.println("Product Price :"+pro.getPrice()); }
	 * m.addAttribute("record", p); return "display"; }
	 */

}
