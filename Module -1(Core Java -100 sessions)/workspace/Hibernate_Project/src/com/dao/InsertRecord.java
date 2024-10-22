package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Customer;

public class InsertRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	 	
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		
		Customer obj = new Customer();
		obj.setCustomerid(1001);
		obj.setCustomerName("Saratha");
		obj.setAddress("Saratha Nagar");
		obj.setCity("Pollachi");
		obj.setState("TamilNadu");
		obj.setPincode(627861);
		obj.setCountry("India");
		
		session.save(obj);
		tx.commit();
		System.out.println("Record Successfully Inserted...");
		session.close();
	}

}
