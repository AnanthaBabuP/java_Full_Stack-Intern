package com.dao;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.model.Flim;


public class FlimDAO {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory fact = cfg.buildSessionFactory();
		Session session = fact.openSession();
		
		Transaction tx = session.beginTransaction();
		Flim f1 = new Flim();
		f1.setFlimname("Ponniyin Selvan");
		f1.setDirector("Manirathnam");
		
		Flim f2 = new Flim();
		f2.setFlimname("Vikram");
		f2.setDirector("Logesh Kanagaraj");
		
		Flim f3 = new Flim();
		f3.setFlimname("Valimai");
		f3.setDirector("H.Vinoth");
		
		session.save(f1);
		session.save(f2);
		session.save(f3);
		
		tx.commit();
		
		session.close();		

	}

}
