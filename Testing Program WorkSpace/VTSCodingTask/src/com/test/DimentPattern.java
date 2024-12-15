package com.test;

import java.util.Scanner;

public class DimentPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = scan.nextInt();
		
		for(int i=n;i>=0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
