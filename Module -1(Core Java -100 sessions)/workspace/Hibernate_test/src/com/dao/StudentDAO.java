package com.dao;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;

import com.model.Student;

public class StudentDAO {
	
	/**
	 * Save Process For Student in relational database
	 * @param std
	 */
	public static void saveStudent(Student std) {
		
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
		Session session  = cfg.buildSessionFactory().openSession();
		try {
			Transaction tx = session.beginTransaction();
			session.save(std);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		
	}

}
