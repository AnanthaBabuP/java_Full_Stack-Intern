package com.example.SpringInitializrProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	public MainController() {
		System.out.println("Main Controller Object Injected..");
	}
	
	@RequestMapping("/")
	public String displayHome() {
		return "Home.jsp";
	}
}
