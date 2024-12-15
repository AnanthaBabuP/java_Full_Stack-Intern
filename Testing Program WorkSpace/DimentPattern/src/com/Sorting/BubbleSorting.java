package com.Sorting;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the Number of Array");
		int n = scan.nextInt();
		int[] numArry = new int[n];
		System.out.println("Enter the Number One by one:");
		
		for(int i=0;i<n;i++)
			numArry[i]=scan.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(numArry[i]<numArry[j]) {
					int temp = numArry[j];
					numArry[j] = numArry[i];
					numArry[i]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(numArry[i]+"\t");
		}
		scan.close();
	}

}
