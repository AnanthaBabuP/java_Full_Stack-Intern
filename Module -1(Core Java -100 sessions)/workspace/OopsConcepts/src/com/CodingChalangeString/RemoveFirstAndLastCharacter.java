package com.CodingChalangeString;

import java.util.Scanner;

public class RemoveFirstAndLastCharacter {

	public static void main(String[] args) {
		// Get Input From User Using Scanner Class 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A String :");
		String str = scan.nextLine();
		
		// Check string length	
		if(str.length()>1) {
			
			// Print After Removed String 
			System.out.println("String after removing first and last character: ");
			System.out.println(str.substring(1, str.length()-1));
		} else {
			
			// If length is less then 1 Print Statement
			System.out.println("Enter Maximum 2 Character");
		}
		
		scan.close();
	}

}
