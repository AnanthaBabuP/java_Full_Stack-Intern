package com.CodingChalangeString;

import java.util.Scanner;

public class ShowDigitOnly {

	public static void main(String[] args) {
		
		// Get Input from User
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The alpha numeric String :");
		String str = scan.next();
		
		// Create StingBuilder
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			// Check it is Digit or Not
			if(isDigit(ch)){
				sb.append(ch);
			}
		}
		
		// After Append integer
		System.out.println("Result Is : "+sb);
		scan.close();

	}
	
	
	/*
	 * Check Is Digit or not
	 * parameter Character
	 * return boolean
	 */
	public static boolean isDigit(char s) {
		switch (s) {
		case '0':
			return true;
		case '1':
			return true;
		case '2':
			return true;
		case '3':
			return true;
		case '4':
			return true;
		case '5':
			return true;
		case '6':
			return true;
		case '7':
			return true;
		case '8':
			return true;
		case '9':
			return true;
		default:
			return false;
		}
	}

}
