package com.test;

import java.util.Scanner;

public class CalculateSumOfDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the Number:");
		int digit = scan.nextInt();
		int val = digit;
		if(val>0) {
			
		}
		int result = 0;
		while (val > 0) {
			result += val % 10;
			val = val / 10;
		}

		System.out.println("Resut is : " + result);
		scan.close();
	}

}
