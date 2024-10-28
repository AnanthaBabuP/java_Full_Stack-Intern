package com.demo.spring.WorkingWithSpring.ConstructorBean;

public class Book {
	private int bookid;
	private String bookName;
	private String author;
	private double price;

	public Book(int bookid, String bookName, String author, double price) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public void display() {
		System.out.println("Constructor Base Bean Display Created..");
		System.out.println("Book Id : " + bookid);
		System.out.println("BookName : " + bookName);
		System.out.println("Book Author : " + author);
		System.out.println("Book Price : " + price);
	}
}
