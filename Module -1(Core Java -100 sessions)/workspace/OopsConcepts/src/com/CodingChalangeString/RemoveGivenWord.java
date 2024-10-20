package com.CodingChalangeString;

import java.util.Scanner;

public class RemoveGivenWord {

	public static void main(String[] args) {
		// Get Original String From User Using scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Original String :");
		
		String originalStr = scan.nextLine();
		
		System.out.println("Enter Removing word in original String :");
		String removeStr = scan.nextLine();
		
		String result = originalStr.replaceAll(removeStr, "").replaceAll("\\s+", " ").trim();
		
		System.out.println("After Removed String Is :");
		System.out.println(result);
		
		scan.close();
	}

}
