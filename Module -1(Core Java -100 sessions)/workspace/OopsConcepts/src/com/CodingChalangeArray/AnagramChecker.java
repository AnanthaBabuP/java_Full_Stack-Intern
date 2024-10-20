package com.CodingChalangeArray;

import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
    	
    	// Get Input From User
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter The First String :");
        String str1 = scan.next();
        System.out.println("Enter The Second String :");
        String str2 = scan.next();
        
        // Check if the strings are anagrams
        boolean result = areAnagrams(str1, str2);
        
        // Print the result
        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
        scan.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Step 1: Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert strings to character arrays
        char[] array1 = str1.toLowerCase().toCharArray();
        char[] array2 = str2.toLowerCase().toCharArray();
        
        // Step 2: Sort both arrays
        sort(array1);
        sort(array2);
        
        // Step 3: Compare sorted arrays
        return areEqual(array1, array2);
    }

    // Method to sort character array using bubble sort
    public static void sort(char[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Method to compare two character arrays
    public static boolean areEqual(char[] array1, char[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}

