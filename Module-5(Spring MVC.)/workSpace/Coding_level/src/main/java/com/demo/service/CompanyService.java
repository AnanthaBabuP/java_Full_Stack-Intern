package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CompanyDAO;
import com.demo.model.Company;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyDAO dao;

	public CompanyService() {
		// TODO Auto-generated constructor stub
	}

	public void saveCompany(Company c) {
		dao.saveCompany(c);
	}

	public List<Company> getAllCompany() {
		return dao.getAllCompanyDao();
	}


}

