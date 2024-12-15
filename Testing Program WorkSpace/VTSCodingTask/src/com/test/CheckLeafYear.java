package com.test;

import java.util.Scanner;

public class CheckLeafYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Year :");
		int year = scan.nextInt();
		if(year >= 1000 && year < 9999) {
		if(year%4 == 0) {
			System.out.println(year+" is Leaf Year..");
		} else {
			System.out.println(year+" is not a Leaf Year..");		
			}
		} else {
			System.err.println("Please Enter Valid Year...");
		}
		scan.close();
	}

}
