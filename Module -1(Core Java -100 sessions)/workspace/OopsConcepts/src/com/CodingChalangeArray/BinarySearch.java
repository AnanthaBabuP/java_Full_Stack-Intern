package com.CodingChalangeArray;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // get number of elements from user
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of elements :");
        n= scan.nextInt();
        
        int arr[]=new int[n];

        // Set to no of element from user ome by one
        System.out.println("Enter the element one by one :");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        // bubble Sort to sorting array
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Get User to find Element 
        System.out.println("Enter the Find element :");
        int find_index = scan.nextInt();

        // Print Order Elements
        System.out.println("Order Elements Check :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // Binary search algoritham
        int left = 0;
        int right = arr.length-1;
        // Redirect to bunarySearch method and get index from the method
        int result = binarySearch(arr, left, right, find_index);
        if (result == -1)
            System.out.println("Element Not Found");
        else
            System.out.println("Element Found Index at :"+ result);

        scan.close();
    }

    /**
     * 
     * @param arr
     * @param left
     * @param right
     * @param findElement
     * @return
     */
    private static int binarySearch(int[] arr,int left,int right,int findElement){
        int index = -1;
        
        while(left <= right){

            int mid = (left+right)/2;

            if(arr[mid] == findElement) {
                index = mid;
                return index;
            } else if(findElement < arr[mid]){
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return index;
    }
}
