package com.CodingChalangeArray;

import java.util.Scanner;

public class OddOrEvenCheck {
    public static void main(String args[]){

        // Get Data From User 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number Of element for Array :");
        int n = scan.nextInt();

        System.out.println("Enter the element One by One");
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        // even number Check
        System.out.println("Even Numbers of Array are :");
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i]);
            }
        }
        
        // Odd number Check
        System.out.println("Odd Numbers of Array are :");
        for(int i=0;i<n;i++){
            if(arr[i]%2 != 0){
                System.out.println(arr[i]);
            }
        }
        scan.close();
    }
}
