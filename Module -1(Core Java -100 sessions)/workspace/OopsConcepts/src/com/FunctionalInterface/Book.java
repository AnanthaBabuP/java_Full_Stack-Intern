package com.FunctionalInterface;

public class Book {

	String name;
	int page;
	public double price;
	
	
	public Book(String name, int page, double price) {
		super();
		this.name = name;
		this.page = page;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [name=" + name + ", page=" + page + ", price=" + price + "]";
	}


//	@Override
//	public int compareTo(Object x) {
//		Book b1 = (Book)x;
//		if(page == b1.page)
//			return 1;
//		else if(page > b1.page)
//			return 0;
//		else 
//			return -1;
//		
//	}
	
//	@Override
//	public int compareTo(Object x) {
//		Book b1 = (Book)x;
//		if(price == b1.price)
//			return 1;
//		else if(price > b1.price)
//			return 0;
//		else 
//			return -1;
//		
//	}
	
//	@Override
//	public int compareTo(Object x) {
//		Book b1 = (Book)x; // DownCasting
//		return this.name.compareTo(b1.name);
//		
//	}

	
//	@Override
//	public int compareTo(Object x) {
//		Book b1 = (Book)x;
//		if(name.length() == b1.name.length())
//			return 1;
//		else if(name.length() > b1.name.length())
//			return 0;
//		else 
//			return -1;
//		
//	}
	
}
