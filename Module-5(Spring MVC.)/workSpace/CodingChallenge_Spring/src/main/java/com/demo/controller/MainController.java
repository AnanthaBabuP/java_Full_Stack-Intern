package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.service.ProductService;

@Controller
public class MainController {

	@Autowired
	private ProductService service;

	public MainController() {
		System.out.println("Main Controller Involed Done...");
	}

	@RequestMapping(value = "/")
	public ModelAndView homePage() {
		List<Product> products = service.getAllProductservice();
		return new ModelAndView("AllProductView.jsp").addObject("products", products);
	}

	@RequestMapping(value = "/register")
	public ModelAndView registerProcess() {
		return new ModelAndView("Register.jsp");
	}

	@RequestMapping(value = "/addProduct")
	public ModelAndView addProduct(Product p) {
		service.addProductDAO(p);

		List<Product> products = service.getAllProductservice();

		return new ModelAndView("AllProductView.jsp").addObject("products", products).addObject("msg",
				"Record Inerted Sucessfully..");
	}

	@RequestMapping(value = "/listProducts")
	public ModelAndView viewAllProducts() {
		List<Product> products = service.getAllProductservice();
		return new ModelAndView("AllProductView.jsp").addObject("products", products);
	}

	@RequestMapping(value = "/deleteRecord")
	public ModelAndView deleteRecord(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("hidenId"));
		int a = service.deleteProductService(id);

		List<Product> products = service.getAllProductservice();
		return new ModelAndView("AllProductView.jsp").addObject("products", products).addObject("msg",
				a + " Record Deleted Sucessfully..");
	}

	@RequestMapping(value = "/searchProduct")
	public ModelAndView searchProduct(HttpServletRequest req) {
		String searchId = req.getParameter("searchId");
		if (searchId.isEmpty()) {
			List<Product> products = service.getAllProductservice();
			return new ModelAndView("AllProductView.jsp").addObject("products", products).addObject("err",
					"Please Enter Value on Text Box");
		} else {
			int id = Integer.parseInt(searchId);
			List<Product> products = service.serchProductByIdService(id);

			return new ModelAndView("AllProductView.jsp").addObject("products", products).addObject("searchId", id);
		}

	}

}
