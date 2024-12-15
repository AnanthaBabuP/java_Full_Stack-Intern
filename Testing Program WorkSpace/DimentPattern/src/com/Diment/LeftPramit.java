package com.Diment;

import java.util.Scanner;

public class LeftPramit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Number >>>");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
