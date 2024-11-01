package com.demo.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("This Is Home Controller Class");
	}
	
	@RequestMapping("/")
	public String homePage() {
		return "index.jsp";
	}
	
	@RequestMapping("/resultProcess")
	public String Process(HttpServletRequest req, Model m) {
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		System.out.println("Number1 ="+n1);
		System.out.println("Number2 ="+n2);
		
		if(n1<0 || n2<0) {
			m.addAttribute("error", "Please Enter Valid Pasitive Numbers:");
			return "Error.jsp";
		} else {
			int result = n1+n2;
			m.addAttribute("res", result);
			return "Result.jsp";
		}
	}
	
	@RequestMapping("/resultProcessAdvanceed")
	public String ProcessAdvance(@RequestParam("n1") int n1,@RequestParam("n2") int n2, Model m) {
//		int n1 = Integer.parseInt(req.getParameter("n1"));
//		int n2 = Integer.parseInt(req.getParameter("n2"));
		System.out.println("Number1 ="+n1);
		System.out.println("Number2 ="+n2);
		
		if(n1<0 || n2<0) {
			m.addAttribute("error", "Please Enter Valid Pasitive Numbers:");
			return "Error.jsp";
		} else {
			int result = n1+n2;
			m.addAttribute("res", result);
			return "Result.jsp";
		}
	}
}
