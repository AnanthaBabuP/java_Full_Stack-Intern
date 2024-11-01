package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public class RegisterationDAO {
	
	@Autowired
	private SessionFactory fact;
	
	public RegisterationDAO() {
		System.out.println("Registeration DAO Created...");
	}
	
	/**
	 * Insertion Process
	 * @param std
	 */
	public void studentRegisterationDAO(Student std) {
		
		Session session = fact.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(std);
		tx.commit();
		
		System.out.println("Student Record Inserted Successfully");
		session.close();
	}
	/**
	 * Select All Students
	 * @return 
	 */
	
	public List<Student> viewAllStudentDAO() {
		Session session = fact.openSession();
		
		List<Student> allStudents =  session.createQuery("From Student").getResultList();
		
		return allStudents;
		
	}

}
