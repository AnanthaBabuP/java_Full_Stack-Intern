package com.CodingChalangeString;

import java.util.Scanner;

public class ReverseStringWord {

	public static void main(String[] args) {
		
		// Get Input from user using Scanner Class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = scan.nextLine();
		
		// Split to empty space
		String[] splitStr = str.split(" ");
		
		// Print on reverse String	With single Line
		System.out.print("Reverse String is : ");
		for(int i = splitStr.length-1;i>=0;i--) {
			System.out.print(splitStr[i] + " ");
		}
		
		// closing scanner class
		scan.close();

	}

}
