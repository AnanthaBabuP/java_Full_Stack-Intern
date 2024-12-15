package com.Diment;

import java.util.Scanner;

public class OffPramit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num = scan.nextInt();
		for (int i = 0; i <= num; i++) {

			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i+1;k<num;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
