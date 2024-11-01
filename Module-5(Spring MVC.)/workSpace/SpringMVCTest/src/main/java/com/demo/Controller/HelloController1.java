package com.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController1 {

	@RequestMapping("/hellow1")
	public String pageForward() {
		return "hellow1.jsp";
	}
}
