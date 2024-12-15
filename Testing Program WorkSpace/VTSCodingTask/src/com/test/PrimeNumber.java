package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number :");
		
		int input = scan.nextInt();
		
		ArrayList<Integer> intArrs = new ArrayList<Integer>();
		
		for(int i=1;i<input;i++) {
			int count = 0;
			for(int j = 1;j<input;j++) {
				if(i%j==0) {
					count+=1;
				}
			}
			if(count <= 2) {
				intArrs.add(i);
			}
		}
		for(Integer intArr : intArrs) {
			System.out.println(intArr);
		}
		
		scan.close();
	}

}
