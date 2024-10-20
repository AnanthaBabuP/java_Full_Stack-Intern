package com.CodingChalangeString;

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		// Get Input From User Using Scanner Class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A String :");
		// Convert input to lower case
		String str = scan.nextLine().toLowerCase();
		
		// Initialize Vowel count
		int vowelCount = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			// Check if character is vowel
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				// If character is vowel increase a count
				vowelCount +=1;
			}
		}
		
		//  Print the Result
		System.out.println(str+" Vowel Cheracter Count Is : "+vowelCount);
		scan.close();
	}

}
