package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Mobile;

public class MobileDAO {
	public void save(Mobile mob) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		
		SessionFactory fact = cfg.buildSessionFactory();
		
		Session sess = fact.openSession();
		Transaction tr = sess.beginTransaction();
		try {
			sess.save(mob);
			tr.commit();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			sess.close();
		}
	}
}
