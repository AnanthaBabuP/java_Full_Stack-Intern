package com.FunctionalInterface;

import java.util.Arrays;

public class ComparatorDemo {

	/*
	 * Using Way of Methods
	 * 1.Traditional 
	 * 2.Anonymous InnerClass
	 * 3.Lambda Expression
	 */
	public static void main(String[] args) {
		Book b1 = new Book("Java",150,225);
		Book b2 = new Book("C",125,148.36);
		Book b3 = new Book("Android",578,740.00);
		Book b4 = new Book("SQL",372,450.0);
		Book b5 = new Book("Dot Net",230,372.0);
		
		Book[] myBook = {b1,b2,b3,b4,b5};
		
		// 1. (Traditional) Basic Comparator Sorting
		
//		Arrays.sort(myBook,new NameSorting());
//		Arrays.sort(myBook,new PageComparator());
//		Arrays.sort(myBook,new PriceSorting());/
		
		// 2.  Anonymous Inner Class Sorting
		
//		name Sorting Anonymous Method
//		Arrays.sort(myBook,new Comparator<Book>() {
//
//			@Override
//			public int compare(Book b1, Book b2) {
//				if(b1.name.length() == b2.name.length())
//					return 1;
//				else if(b1.name.length() > b2.name.length())
//					return 0;
//				else 
//					return -1;
//			}
//		});
		
//		Page Sorting
//		Arrays.sort(myBook,new Comparator<Book>() {
//
//			@Override
//			public int compare(Book x1, Book x2) {
//				if(x1.page == x2.page)
//					return 1;
//				else if(x1.page > x2.page)
//					return 0;
//				else
//					return -1;
//			}
//		
//		});
		
//		 Price Sorting
//		Arrays.sort(myBook,new Comparator<Book>() {
//
//			@Override
//			public int compare(Book x, Book y) {
//				if(x.price > y.price)
//					return 1;
//				else if (x.price == y.price)
//					return 0;
//				else
//					return -1;
//			}
//		
//		});
		
		
		// 3. Lambda Expression
//		 Lambda Expression Name Sorting
//		Arrays.sort(myBook,(Book x, Book y) -> {
//				if(x.name.length() == y.name.length())
//					return 1;
//				else if(x.name.length() > y.name.length())
//					return 0;
//				else 
//					return -1;
//			}
//		);
		
		
//		 Lambda Expression Page Sorting
//		Arrays.sort(myBook,(Book x1, Book x2) -> {
//				if(x1.page == x2.page)
//					return 1;
//				else if(x1.page > x2.page)
//					return 0;
//				else
//					return -1;
//			}
//		);
		
//		 Lambda Expression Price Sorting
		Arrays.sort(myBook,(Book x, Book y) -> {
				if(x.price > y.price)
					return 1;
				else if (x.price == y.price)
					return 0;
				else
					return -1;
			}
		);
		
		
		for (int i=0;i<myBook.length;i++) {
			System.out.println(myBook[i]);
		}


	}

}
