package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.ProductTable;

@Repository
public interface ProductRepository extends CrudRepository<ProductTable, Integer>{

}
