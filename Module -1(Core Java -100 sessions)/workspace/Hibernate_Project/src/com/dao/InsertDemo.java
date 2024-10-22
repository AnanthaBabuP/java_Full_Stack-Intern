package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Demo;


public class InsertDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Demo demo = new Demo();
		
		demo.setId(1001);
		demo.setName("Murali");
		
		session.save(demo);
		tx.commit();
		System.out.println("Record Successfully Inserted...");

		session.close();
	}
}
