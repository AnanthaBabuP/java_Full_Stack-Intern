package com.web.controller;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	
	public LoginController() {
		System.out.println("Fornt Controller Invoke..");
	}
	
	@RequestMapping("/")
	public String init() {
		return "home";
	}

}
