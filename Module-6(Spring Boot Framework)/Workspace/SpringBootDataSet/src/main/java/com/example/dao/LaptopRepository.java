package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Laptop;

@Repository
public interface LaptopRepository extends CrudRepository<Laptop, Integer> {

}
