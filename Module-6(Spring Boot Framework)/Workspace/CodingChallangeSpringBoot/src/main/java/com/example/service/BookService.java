package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dao.BookDAO;
import com.example.model.Book;

@Service
public class BookService {

	BookDAO dao;

	public BookService(BookDAO dao) {
		System.out.println("Book Service Invoked");
		this.dao = dao;
	}

	/**
	 * Register Book Details
	 * 
	 * @param b
	 */
	public void saveBook(List<Book> b) {
		dao.saveAll(b);
	}

	/**
	 * Update Or Insert Process
	 * 
	 * @param b
	 */
	public void update(Book b) {
		dao.save(b);
	}

	/**
	 * Retrieve All Books Details
	 * 
	 * @return
	 */
	public Iterable<Book> findAllBooks() {
		return dao.findAll();
	}

	/**
	 * Find Book By Id
	 * 
	 * @param id
	 * @return
	 */
	public Book findById(int id) {
		return dao.findById(id).orElse(null);
	}

	/**
	 * Delete Book Detail By Id
	 * 
	 * @param id
	 */
	public void deleteBookById(int id) {
		dao.deleteById(id);
	}
}
