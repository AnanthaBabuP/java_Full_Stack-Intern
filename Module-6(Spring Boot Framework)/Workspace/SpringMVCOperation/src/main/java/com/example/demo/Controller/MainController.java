package com.example.demo.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProductDAO;
import com.example.demo.model.Product;

@RestController
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

	/**
	 * SAVE PROCCESS
	 * @param p
	 * @return
	 */
	@PostMapping(path="/saveProduct", consumes = {"application/json"})
	public Product saveProcess(@RequestBody Product p) {
		return dao.save(p);
	}
	
//	@PostMapping("/saveProductFormData")
//	public String saveProcessUsingFormData(Product p) {
//		dao.save(p);
//		return "Home";
//	}
//	
//	@PostMapping(path="/saveProductRawData", consumes = {"application/xml"})
//	public String saveProcessUsingRawData(@RequestBody Product p) {
//		dao.save(p);
//		return "Home";
//	}
	
	@PutMapping(path="/updateProduct", consumes = {"application/json"})
	public Product updateProtect(@RequestBody Product p) {
		dao.save(p);
		System.out.println("Updated..");
		return p;
	}
	
	@DeleteMapping(path="/deleteProduct/{pid}", consumes = {"application/json"})
	public String deleteProduct(@PathVariable("pid") int id) {
//		Product p = dao.findById(id).get();
//		
//		dao.delete(p);
//		System.out.println("Deleted..");
		// OR
		
		
		dao.deleteById(id);
		System.out.println("Deleted..");
		return "Deleted...";
	}


	@GetMapping(path="/viewAllProducts",produces = {"application/xml"})
	@ResponseBody
	public Iterable<Product> viewAllProducts() {
		return dao.findAll();
	}

	@GetMapping("/product/{pid}")
	@ResponseBody
	public Product viewOneProduct(@PathVariable("pid") int pid) {
		return dao.findById(pid).orElse(null);
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
