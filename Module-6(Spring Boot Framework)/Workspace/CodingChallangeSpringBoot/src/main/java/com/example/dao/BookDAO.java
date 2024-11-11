package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Book;

@Repository
public interface BookDAO extends CrudRepository<Book, Integer>{

}
