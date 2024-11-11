package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.service.BookService;

@RestController
public class BookController {

	private BookService service;

	/**
	 * Parameterized Constructor
	 * 
	 * @param service
	 */
	public BookController(BookService service) {
		System.out.println("Front-REST-Controller Invoked...");
		this.service = service;
	}

	/**
	 * Get all bookdetaiIs• GET/Books
	 * 
	 * @return
	 */
	@GetMapping("/books")
	public Iterable<Book> getAllBookDetails() {
		return service.findAllBooks();
	}

	/**
	 * Get a book by ID• GET/book/(id]
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/book/{id}")
	public Book findBookById(@PathVariable int id) {
		return service.findById(id);
	}

	/**
	 * Create a new book• POST/
	 * 
	 * @param b
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/")
	public String registerBook(@RequestBody List<Book> b) throws Exception {
		service.saveBook(b);
		return "Successfullt Registered";
	}

	/**
	 * Update an existing book Details• PUT/books/{id}
	 * 
	 * @param id
	 * @param book
	 * @return
	 */
	@PutMapping("/books/{id}")
	public String updateBookDetails(@PathVariable int id, @RequestBody Book book) {
		service.update(book);
		return "Updated Successfully";
	}

	/**
	 * Delete a book• DELETE/book/{id}
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/book/{id}")
	public String deleteBookById(@PathVariable int id) {
		service.deleteBookById(id);
		return "Book Deleted Successfully";
	}
}
