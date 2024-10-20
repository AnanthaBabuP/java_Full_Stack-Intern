package com.CodingChalangeString;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RepeatedCharactor {

	public static void main(String[] args) {
		// Get Input from User using Scanner Class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = scan.nextLine();
		
		// Create a hashMap
		Map<Character, Integer> charCountMap = new HashMap<>();
		
		// Loop through each character in a string
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			// Check to contain key of HashMap
			if(charCountMap.containsKey(ch)) {
				// if exist char count value add +1
				charCountMap.put(ch, charCountMap.get(ch)+1);
			} else {
				// New char declare as value on 1
				charCountMap.put(ch, 1);
			}
		}
		
		
		// Print repeated Values
		System.out.println("repeated Characters Are :");
		
		for(Entry<Character, Integer> eMap : charCountMap.entrySet()) {
			if(eMap.getValue() > 1){
				System.out.println("Character :"+eMap.getKey()+" Repeated on "+eMap.getValue()+" Times");
			}
		}
		
		scan.close();
	}

}
