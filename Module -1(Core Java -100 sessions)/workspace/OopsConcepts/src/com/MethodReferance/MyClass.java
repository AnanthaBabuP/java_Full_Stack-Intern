package com.MethodReferance;

public class MyClass {

	double x;
	int i;
	
	
	public MyClass(double x, int i) {
		System.out.println("Constractor Reference");
		this.x = x;
		this.i = i;
		System.out.println("Result = "+x+i);
	}

	public static void main(String[] args) {

		
		// 1. Non-Static Method's Method Reference // ContaingObject::instanceMethod
		// MyClass obj1 = new MyClass();
		// MyInterface obj2 = obj1 :: m1; // Method Reference
		
		
		// 2. Static Method Reference  // ContainingClass :: staticMethodName
		//MyInterface obj2 = MyClass::m2; // Method Reference for Static method
		
		// 3. Contractor Method Reference
		MyClass obj1 = new MyClass(5.6,22);
		MyInterface obj2 = MyClass::new;
		obj2.add(2.8, 10);
//		System.out.println(obj2.add(15.0, 15));

	}
	
	double m1(double x,int y) { // non-static method
		return x-y;
	}
	
	public static double m2(double x,int y) { // non-static method
		return x+y;
	}
}
