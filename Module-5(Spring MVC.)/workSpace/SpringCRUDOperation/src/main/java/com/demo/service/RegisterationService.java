package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.RegisterationDAO;
import com.demo.model.Student;

@Service
public class RegisterationService {
	
	@Autowired
	private RegisterationDAO dao;
	
	public RegisterationService() {
		System.out.println("Registeration Service Object Created..");
	}
	
	public void studentRegisterationService(Student std) {
		dao.studentRegisterationDAO(std);
	}
	
	public List<Student> viewAllStudentService(){
		return dao.viewAllStudentDAO();
	}
}
