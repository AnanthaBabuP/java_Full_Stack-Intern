package com.ComparatorInterface;

import java.util.Arrays;
import java.util.Scanner;

public class ComaparatorInterface {

	public static void main(String[] args) {
		Books[] myBook = {
				new Books("java",400,250.0),
				new Books("android",358,168.0),
				new Books("php",320,125.0),
				new Books("sql",700,560.0),
				new Books("c",368,175.0)
		};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sorted Based on...");
		String input = scan.next();
		
		if(input.equalsIgnoreCase("name")) {
			Arrays.sort(myBook);
		}
		if(input.equalsIgnoreCase("page")) {
			Arrays.sort(myBook,new PageComparator());
		}
		if(input.equalsIgnoreCase("price")) {
			Arrays.sort(myBook,new PriceComparator());
		}
			
		
		for(Books b : myBook)
			System.out.println(b);
	}

}
