package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dao.StudentRepository;
import com.example.model.Student;

@Service
public class StudentService {
	
	private StudentRepository dao;

	public StudentService(StudentRepository dao) {
		this.dao = dao;
	}
	
	public Iterable<Student> registerStudent(List<Student> std) {
		return dao.saveAll(std);
	}
	
	public Iterable<Student> showAllStudents() {
		return dao.findAll();
	}
	
	public Student findByStudentId(int id) {
		return dao.findById(id).orElse(null);
	}
	
	public Student updateStudent(Student std) {
		return dao.save(std);
	}

	public void deleteStudentById(int id) {
		dao.deleteById(id);
	}
}
