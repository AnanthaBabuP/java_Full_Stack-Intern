package com.demo.controller;

import java.util.List;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Student;
import com.demo.service.RegisterationService;

@Controller
public class MVCController {
	
	@Autowired
	private RegisterationService service;

	public MVCController() {
		System.out.println("Front -Controller Involed");
	}
	
	@RequestMapping("/")
	public String homePage() {
		
		return "Registration.jsp";
	}
	
	@RequestMapping(value = "/registerProcess",method = RequestMethod.POST)
	public ModelAndView registerForm(Student s) {
		service.studentRegisterationService(s);
		return new ModelAndView("success.jsp").addObject("success", "Record Successfully Inserted..");
	}
	
	@RequestMapping("/viewAllStudents")
	public ModelAndView viewAllStudents() {
		List<Student> allStudents =  service.viewAllStudentService();
		/*for(int i=0;i<allStudents.size();i++) {
			 * System.out.println(allStudents.get(i).getSid()
			 * +"\t"+allStudents.get(i).getSname() +"\t"+allStudents.get(i).getSage()
			 * +"\t"+allStudents.get(i).getSaddress() +"\t"+allStudents.get(i).getScourse()
			 * );
		}*/
		return new ModelAndView("AllStudents.jsp").addObject("students", allStudents);

	}
}
