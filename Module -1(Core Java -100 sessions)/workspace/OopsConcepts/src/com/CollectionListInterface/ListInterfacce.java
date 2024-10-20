package com.CollectionListInterface;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListInterfacce {

	public static void main(String[] args) {
		// 
		List a1 = new LinkedList(); // UpCasting
		
		// public void add(int index ,Object obj)
		// public Object set(int index, Object obj)
		// public Object remove(int index)
		// public boolean remove(Object obj)
		// public Object get(int index)
		// public int indexOf(Object obj)
		// public int lastIndexOf(Object obj)
		
		a1.add("java");
		a1.add("sql");
		a1.add("python");
		a1.add("php");
		a1.add("android");
		
		// add with index method (just inset with the index)
		a1.add(1, "c");
		System.out.println(a1);
		
		// set with index (remove to index element and set the object value)
		a1.set(4, "React js");
		System.out.println(a1);
		
		// remove
		a1.remove(2); // remove with index
		System.out.println(a1);
		a1.remove("android"); // remove with object
		System.out.println(a1);
		
		//set method
		System.out.println(a1.get(3));
		
		// indexOf
		System.out.println(a1.indexOf("React js"));
		
		// lastIndexOf
		a1.add("java");
		System.out.println(a1);
		System.out.println(a1.lastIndexOf("java"));
		
		// sublist
		System.out.println(a1.subList(1, 4));

		// listIterator
		System.out.println("Display Element using Iterator");
		Iterator itr = a1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Display Element using ListIterator");
		ListIterator litr = a1.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
	}

}
