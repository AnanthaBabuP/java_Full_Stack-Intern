package com.dao;

import org.hibernate.cfg.Configuration;

import com.model.Customer;

import org.hibernate.*;


public class UpdateRecord {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx  = session.beginTransaction();
		
		Customer obj = (Customer) session.get(Customer.class, 1000);
		
		obj.setCountry("India");
		
		//session.saveOrUpdate(obj);
		// Or
		session.update(obj);
		tx.commit();
		System.out.println("One Record Updated Successfully...");
		session.close();
	}

}
