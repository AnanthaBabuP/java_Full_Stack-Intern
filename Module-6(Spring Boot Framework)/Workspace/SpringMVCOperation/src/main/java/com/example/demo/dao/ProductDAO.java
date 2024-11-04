package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer>{

	List<Product> findBypname(String name);

	List<Product> findByquantity(int gty);
	List<Product> findByquantityGreaterThan(int gty);

}
