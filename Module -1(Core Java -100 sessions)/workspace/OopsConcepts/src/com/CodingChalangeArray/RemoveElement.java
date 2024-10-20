package com.CodingChalangeArray;

import java.util.Scanner;

public class RemoveElement {
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
        
        System.out.println("Enter The Remove Element :");
        int remove_element = scan.nextInt();
        
        int[] after_removed_arr = removeElement(arr,remove_element);
        
        // Print After remove element Array
        if(after_removed_arr.length != arr.length){
            System.out.println("After Remove Element on Array Values Are :");
            for(int remElements: after_removed_arr){
                System.out.println(remElements);
            } 
        } else {
            System.out.println("This Element Not Found At Array");
        }
        
        scan.close();
    }

    private static int[] removeElement(int[] arr,int removeElement){
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == removeElement){
                count++;
            }
        }

        int[] rem_arr = new int[arr.length-count];

        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != removeElement){
                rem_arr[index++] = arr[i];
            }
        }
        return rem_arr;
    }
}
