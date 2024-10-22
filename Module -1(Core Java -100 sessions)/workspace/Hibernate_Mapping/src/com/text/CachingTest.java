package com.text;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class CachingTest {

	public static void main(String[] args) {
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Student.class);
			
			SessionFactory fact =cfg.buildSessionFactory();
			Session s = fact.openSession();
			Student s1 = s.get(Student.class, 1);
			System.out.println(s1);
			s.close();
			
			Session sessin2 = fact.openSession();
			Student s2 = sessin2.get(Student.class, 1);
			System.out.println(s2);
			
//			Student s3 = s.get(Student.class, 1);
//			System.out.println(s3);
			sessin2.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
