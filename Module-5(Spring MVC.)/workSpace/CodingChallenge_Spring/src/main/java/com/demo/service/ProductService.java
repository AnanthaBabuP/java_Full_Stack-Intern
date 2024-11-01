package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDAO;
import com.demo.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDAO dao;

	public void addProductDAO(Product p) {
		dao.addProductDAO(p);
	}

	public List<Product> getAllProductservice() {
		return dao.getAllProductsDAO();
	}

	public int deleteProductService(int id) {
		return dao.deleteProductDAO(id);
	}

	public List<Product> serchProductByIdService(int id) {
		return dao.serchProductByIdDAO(id);
	}
}
