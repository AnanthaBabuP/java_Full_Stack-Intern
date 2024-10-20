package com.CodingChalangeArray;

import java.util.Scanner;

public class RemoveDublicateElement {

	public static void main(String[] args) {

		// Get Data From User
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number Of element for Array :");
		int n = scan.nextInt();

		// Get Array Element one by one from user
		System.out.println("Enter the array element one by one");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int[] result = removeDublicate(arr);
		// After Removed Array
		System.out.println("Dublicate removed Array is");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		scan.close();
	}

	private static int[] removeDublicate(int[] arr) {

		// Create a temporary array to hold unique elements
		int[] tempArray = new int[arr.length];
		int uniqueCount = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;

			// Check if arr[i] is already in tempArray
			for (int j = 0; j < uniqueCount; j++) {
				if (arr[i] == tempArray[j]) {
					isDuplicate = true;
					break;
				}
			}

			// If not a duplicate, add it to tempArray
			if (!isDuplicate) {
				tempArray[uniqueCount++] = arr[i];
			}
		}

		// Create a new array of the correct size
		int[] uniqueArray = new int[uniqueCount];
		for (int i = 0; i < uniqueCount; i++) {
			uniqueArray[i] = tempArray[i];
		}

		return uniqueArray;
	}

}
