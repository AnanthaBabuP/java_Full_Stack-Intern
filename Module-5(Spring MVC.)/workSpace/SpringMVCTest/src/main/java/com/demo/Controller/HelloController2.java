package com.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController2 {

	@RequestMapping("/hellow2")
	public String pageForward() {
		return "hellow2.jsp";
	}
	
	@RequestMapping("/welcome")
	public String pageForwardSample() {
		return "welcome.jsp";
	}
}
