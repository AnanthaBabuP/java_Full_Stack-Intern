package com.example.demo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book implements Serializable {

	@Value("1001")
	private int book_id;
	
	@Value("Spring Boot Introduction")
	private String book_name;
	
	@Value("360.90")
	private double price;
	
	@Autowired
	@Qualifier(value = "authorQualifer")
	private Author author;
	
	public Book() {
		System.out.println("Book Object Created..");
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", price=" + price + "]";
	}

	public void display() {
		System.out.println("\nBook Id : "+book_id);
		System.out.println("Book Name : "+book_name);
		System.out.println("Book Price : "+price);
		author.display();
	}
}
