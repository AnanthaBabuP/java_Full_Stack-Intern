package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Company;
import com.demo.service.CompanyService;

@Controller
public class MainController {
	@Autowired
	private CompanyService service;

	public MainController() {
		System.out.println("Main Controller Invoked");
	}
	
	@RequestMapping(value =  "/")
	public String homePage() {
		return "Register.jsp";
	}
	
	@RequestMapping(value =  "/register")
	public String RegisterPage() {
		return "Register.jsp";
	}
	
	@RequestMapping("/registerCompany")
	public ModelAndView registerCompanys(Company c) {
		service.saveCompany(c);
		
		List<Company> companys =  service.getAllCompany();
		return new  ModelAndView("ShowAllComanyDetails.jsp").addObject("Companys", companys).addObject("msg", "Data Inserted Successfully");
	}
	
}
