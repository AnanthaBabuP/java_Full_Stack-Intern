package com.Diment;

import java.util.Scanner;

public class ReverseRightPramit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Number >>>");
		int num = scan.nextInt();
		for(int i = num;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
