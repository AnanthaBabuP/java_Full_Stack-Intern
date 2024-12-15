package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();  // <E> -> Generic
		
		// Collection Add Method
		a1.add("Java");
		a1.add("C");
		a1.add("PHP");
		a1.add(25);
		a1.add('$');
		a1.add(2.86);
		System.out.println(a1); // calling toString method
		
		// size method
		System.out.println(a1.size());
		
		// clear method
//		a1.clear();
		System.out.println(a1);
		
		// isEmpty method
		System.out.println(a1.isEmpty());
//		a1.add("Hi");
		System.out.println(a1.isEmpty());
		
		// addAll method
		ArrayList a2 = new ArrayList();
		a2.addAll(a1);
		
		System.out.println("A1 : "+a1);
		System.out.println("A2 : "+a2);
		
		// contains,containAll method
		System.out.println(a1.contains("Hi"));
		System.out.println(a1.containsAll(a2));
		
		// removeAll method
		a1.removeAll(a2);
		System.out.println(a1);
		
		// hashcode method
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		// public boolean equals
		
		System.out.println(a1.equals(a2) );
		
		// toArray method
		Object[] myArr = a2.toArray();
		for(Object arr : myArr) {
			System.out.println(arr);
		}
		
		// iterator interface
		Iterator iterator = a2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
