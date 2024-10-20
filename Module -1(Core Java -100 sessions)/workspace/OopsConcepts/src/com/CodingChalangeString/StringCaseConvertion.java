package com.CodingChalangeString;

import java.util.Scanner;

public class StringCaseConvertion {

	public static void main(String[] args) {
		
		// Get Input from User Using Scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The String");
		String input=scan.nextLine(); 
		
		//Create Case StringBuilder
		char[] upperCase = new char[input.length()];
		char[] lowerCase = new char[input.length()];
		
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			
			// Convert LowerCase to UperCase
			if(ch >='a' && ch <= 'z') {
				upperCase[i] = (char)(ch-32); // Down Casting To reduce ASCII Value
			} else {
				upperCase[i] = ch;
			}
			
			// Convert UpperCase to LowerCase 
			if(ch >= 'A' && ch <= 'Z') {
				lowerCase[i] = (char)(ch+32); // DownCasting to add ASCII value
			} else {
				lowerCase[i] = ch;
			}
		}
		
		// Print on UperCase And LowerCase
		System.out.println("Upper Case : "+new String(upperCase));
		System.out.println("Lower Case : "+new String(lowerCase));
		
		scan.close();
	}
}
