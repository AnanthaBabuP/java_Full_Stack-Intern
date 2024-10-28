package com.demo.spring.WorkingWithSpring.SetterBean;

public class Book {
	private int bookid;
	private String bookName;
	private String author;
	private double price;

	public Book() {
		System.out.println("Setter Base Bean Created...");
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println("Setter Base Bean Display Created..");
		System.out.println("Book Id : " + bookid);
		System.out.println("BookName : " + bookName);
		System.out.println("Book Author : " + author);
		System.out.println("Book Price : " + price);
	}
}
