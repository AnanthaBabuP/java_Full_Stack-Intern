package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}
	
	@PostMapping(path = "/")
	public Iterable<Student> registerStudentDetail(@RequestBody List<Student> std) {
		return service.registerStudent(std);
	}

	@GetMapping(path = "/students")
	public Iterable<Student> showAllStudentsController() {
		return service.showAllStudents();
	}
	
	@GetMapping(path = "/students/{id}")
	public Student findByStudentId(@PathVariable int id) {
		return service.findByStudentId(id);
	}
	
	@PutMapping(path = "/student")
	public Student updateStudent(@RequestBody Student std) {
		return service.updateStudent(std);
	}

	@DeleteMapping(path = "/student/{id}")
	public void deleteStudentById(@PathVariable int id) {
		service.deleteStudentById(id);
	}
}
