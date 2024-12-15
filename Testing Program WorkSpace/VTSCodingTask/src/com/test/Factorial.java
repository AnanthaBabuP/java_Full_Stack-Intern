package com.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The n Value :");
		int n = scan.nextInt();

		int first = 0;
		int second = 1;

		if (n == 1) {
			System.out.println(n + " th factorial Value is :" + first);
		} else if (n == 2) {
			System.out.println(n + " th factorial Value is :" + second);
		} else if (n >= 3) {
			int fact = 0;
			for (int i = 3; i <= n; i++) {
				fact = first + second;
				first = second;
				second = fact;
			}
			System.out.println(n + " th factorial Value is :" + fact);
		}
		
//		int result = recrsive(first,second,n);
//		System.out.println(result);

	}

//private

}
