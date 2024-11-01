package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.Company;

@Repository
public class CompanyDAO {
	
	public CompanyDAO() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private SessionFactory fact;
	
	public void saveCompany(Company c) {
		try {
			Session session = fact.openSession();
			Transaction tx = session.beginTransaction();
			
			session.save(c);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List<Company> getAllCompanyDao() {
		List<Company> companys = null;
		
		try {
			Session session = fact.openSession();
			companys = session.createQuery("From Company").getResultList();
			
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return companys;
	}
}
