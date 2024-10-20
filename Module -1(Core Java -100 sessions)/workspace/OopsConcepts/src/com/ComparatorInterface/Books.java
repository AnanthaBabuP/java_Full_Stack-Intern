package com.ComparatorInterface;


public class Books implements Comparable {
	String bookName;
	int pages;
	double price;
	
	
	public Books(String bookName, int pages, double price) {
		super();
		this.bookName = bookName;
		this.pages = pages;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Books [bookName=" + bookName + ", pages=" + pages + ", price=" + price + "]";
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Books b1 = (Books)o;
		return this.bookName.compareTo(b1.bookName);
	}
}
