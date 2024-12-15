package com.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.LoginDetails;

@Controller
public class LoginController {
	
	
	public LoginController() {
		System.out.println("Fornt Controller Invoke..");
	}
	
	@RequestMapping("/")
	public String init() {
		return "home";
	}
	
	@RequestMapping("/register")
	public String register(@RequestBody LoginDetails detail) {
		System.out.println("UserName :"+detail.getUserName());
		detail.toString();
		return "home";
	}

}
