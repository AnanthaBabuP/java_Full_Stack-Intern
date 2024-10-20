package com.FunctionalInterface;

import java.util.Arrays;

public class ComparableDemo {

	public static void main(String[] args) {
		Book b1 = new Book("Java",150,225);
		Book b2 = new Book("C",125,148.36);
		Book b3 = new Book("Android",578,740.00);
		Book b4 = new Book("SQL",372,450.0);
		Book b5 = new Book("Dot Net",230,372.0);
		
		Book[] myBook = {b1,b2,b3,b4,b5};
		
		Arrays.sort(myBook);
		
		for (int i=0;i<myBook.length;i++) {
			System.out.println(myBook[i]);
		}

	}

}
