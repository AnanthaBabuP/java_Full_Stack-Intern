package com.GarpageColletion;

public class GarbageCollectionDemo {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Ananth", 25);
		Student s2 = new Student(2, "Sathish", 23);
		
		Student s3 = new Student(3, "Sathish", 25);
		new Student(4,"Nithya",22); // anonymous object 
		
		/* How to Dereference an object in java
		1. By Making a reference null
		2. By Assigning a reference to another
		3. By Using an anonymous object
		*/
		System.out.println(s1);
		System.out.println(s2);
		
		s1 = null; // Eligible for garbage collection (GC)
		s2 = s3; // Eligible for garbage collection
		
		System.gc();
	}

}
