package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("Front Controller Object Created...");
	}

	
	@RequestMapping("/home")
	public String homepage(HttpServletRequest req) {
		System.out.println("Hellow..");
		String name = req.getParameter("name");
		HttpSession session = req.getSession();
		session.setAttribute("n", name);

		return "Register";
	}
	
	@RequestMapping("/homeWithAnnotation")
	public String homepage1(@RequestParam("name") String name, HttpSession session) {
		
		session.setAttribute("n", name);

		return "Register";
	}
}
