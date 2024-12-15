package com.Sorting;

import java.util.Scanner;

public class CommonMethods {
	
	Scanner scan = new Scanner(System.in);

	public void printArray(int[] arry) {
		int lengthArry = arry.length;
		if (lengthArry != 0) {
			for (int i = 0; i < lengthArry; i++) {
				System.out.print(arry[i] + "\t");
			}
			System.out.println();
		} else {
			System.out.println("Array Size is ZERO");
		}

	}

	public int getNumberUsingScanner() {
		// TODO Auto-generated method stub
		return scan.nextInt();
	}

}
