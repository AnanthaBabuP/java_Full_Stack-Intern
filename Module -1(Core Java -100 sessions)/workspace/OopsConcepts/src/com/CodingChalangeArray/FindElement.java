package com.CodingChalangeArray;

import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get Data From User 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number Of element for Array :");
        int n = scan.nextInt();
        
        // Array length check
        if(n < 3) {
        	System.out.println("Array must contain at least three elements.");
        } else {
	        // Get Array Element one by one from user
	        System.out.println("Enter the array element one by one");
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++) {
	        	arr[i] = scan.nextInt();
	        }
	        
	        // Calling findElement method
	        int[] result = findElement(arr);
	        
	        System.out.println("Arrays Third Largest Element in : "+ result[0]);
	        System.out.println("Arrays Second Smallest Element in : "+ result[1]);
        }
        scan.close();
	}

	private static int[] findElement(int[] arr) {
		
		int arrLength = arr.length;
		// Sort a array
		for(int i =0; i<arrLength;i++) {
			for(int j=i+1;j<arrLength;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// Print Sorted Array
		System.out.println("After Sorting Array ");
		for(int i=0;i<arrLength;i++) {
			System.out.println(arr[i]);
		}
		
		// After Array Sorted  Find the third largest and second smallest elements
		int thirdLargest = arr[arrLength-3];
		int secondSmallest = arr[1];
		
		// Set to value to array and return the value
		return new int[] {thirdLargest,secondSmallest};
	}

}
