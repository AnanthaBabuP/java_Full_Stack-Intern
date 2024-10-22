package com.dao;

import java.util.ArrayList;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Customer;

public class CustomDAO {

	public static void main(String[] args) {
//		customerUpdate("Tirunelveli",1000);
//		selelectAll();
		selectCustomerByState("TamilNadu");
		
//		customerCount("TamilNadu");
		
		deleteCustomer(1000);
	}
	
	

	



	/**
	 * UPDATE HQL QUERY
	 * 
	 * @param city
	 * @param customerid
	 */
	public static void customerUpdate(String city, int customerid) {
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory factory = config.buildSessionFactory();
			Session session = factory.openSession();
			
			Transaction tx  = session.beginTransaction();
			
			Query query = session.createQuery("update Customer set city = '"+city+"' Where customerid="+customerid); // That table tame represent the Entity name
			int count = query.executeUpdate();
			if (count >=1) {
				System.out.println("Successfully Updated");
			}
			else {
				System.out.println("Update Failled" );
			}
			
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * SELECT ALL DATA USING ENTITY CLASS
	 * 
	 */
	public static void selelectAll() {
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory factory = config.buildSessionFactory();
			Session session = factory.openSession();
			
			Transaction tx  = session.beginTransaction();
			
			Query query = session.createQuery("from Customer");
			ArrayList<Customer> allPerstentData = (ArrayList<Customer>) query.getResultList();
			
			for (int i=0; i< allPerstentData.size();i++) {
				System.out.println(allPerstentData.get(i).getCustomerid());
				System.out.println(allPerstentData.get(i).getCustomerName());
				System.out.println(allPerstentData.get(i).getAddress());
				System.out.println(allPerstentData.get(i).getCity());
				System.out.println(allPerstentData.get(i).getCountry());
				System.out.println(allPerstentData.get(i).getPincode());
			}
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * SELECT ALL DATA USING STATE
	 * 
	 * @param state
	 */
	public static void selectCustomerByState(String state) {
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory factory = config.buildSessionFactory();
			Session session = factory.openSession();
			
			Transaction tx  = session.beginTransaction();
			
			Query query = session.createQuery("from Customer c where c.state=?1");
			query.setParameter(1, state);
			ArrayList<Customer> allPerstentData = (ArrayList<Customer>) query.getResultList();
			
			for (int i=0; i< allPerstentData.size();i++) {
				System.out.println(allPerstentData.get(i).getCustomerid());
				System.out.println(allPerstentData.get(i).getCustomerName());
				System.out.println(allPerstentData.get(i).getAddress());
				System.out.println(allPerstentData.get(i).getCity());
				System.out.println(allPerstentData.get(i).getCountry());
				System.out.println(allPerstentData.get(i).getPincode());
			}
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * GET COUNT FOR DATA BASED ON STATE
	 * 
	 * @param string
	 */
	public static void customerCount(String state) {
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory factory = config.buildSessionFactory();
			Session session = factory.openSession();
			
			Transaction tx  = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) from Customer c where c.state=?1"); //1 Position Parameter
			query.setParameter(1, state);
			
			Object count = query.uniqueResult();
			System.out.println("Count : "+count);
			
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void deleteCustomer(int id) {
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory factory = config.buildSessionFactory();
			Session session = factory.openSession();
			
			Transaction tx  = session.beginTransaction();
			
//			Query query = session.createQuery("Delete from Customer where customerid = "+id);
			Query query = session.createQuery("Delete from Customer where customerid = ?1 ");
			query.setParameter(1, id);

			int count = query.executeUpdate();
			if (count >=1) {
				System.out.println("Successfully Deleted ...");
			}
			else {
				System.out.println("Delete Failled" );
			}
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
