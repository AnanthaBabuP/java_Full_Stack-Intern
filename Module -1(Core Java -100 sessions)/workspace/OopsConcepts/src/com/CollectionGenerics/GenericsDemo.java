package com.CollectionGenerics;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Genetics is a non-primitive type
		// It is a run time store 
		// ADVANDAGE
		// 	Type Safety
		// 	Type casting not required
		//  Avoiding to compile time error
		
		// Genetics is mention to the type handle of collection
		
		// JDK 1.4
		/*ArrayList a1 = new ArrayList();
		a1.add("java");
		a1.add("python");
		a1.add(new Integer(25));
		a1.add(new Boolean(true));
		a1.add(new Double(2.85));
		System.out.println(a1);*/
		
		
		// JDK 1.5
		/*ArrayList<String> a1 = new ArrayList<String>();
		a1.add("java");
		a1.add("python");
		a1.add(25);
		a1.add(true);
		a1.add(2.85);
		System.out.println(a1); */
		
		// JDK 1.7
		ArrayList<String> a1 = new ArrayList(); // String type collection
		a1.add("java");
		a1.add("Python");
		
		System.out.println(a1);
		
	}

}
