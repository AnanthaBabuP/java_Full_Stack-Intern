package com.dao;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.model.Customer;


public class SelectRecords {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Customer obj=  (Customer) session.get(Customer.class, 1000);
		System.out.println("Show Customer Details:");
		System.out.println("--------------------------------");
		
		System.out.println("Customer Id :"+obj.getCustomerid()
						+"\nCustomer Name :"+obj.getCustomerName()
						+"\nCustomer Address:"+obj.getAddress());
		System.out.println("--------------------------------");
		session.close();
	}

}
