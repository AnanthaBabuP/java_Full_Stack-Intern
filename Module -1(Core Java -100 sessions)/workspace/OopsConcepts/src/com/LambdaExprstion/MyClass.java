package com.LambdaExprstion;

//1.public class MyClass implements MyInterface{
public class MyClass {
	public static void main(String[] args) {
//		1.
//		MyInterface obj = new MyClass(); // Up-Casting
//		obj.show();
		
//		2.
//		MyInterface obj = new MyInterface() {
//			
//			public void show() {
//				// TODO Auto-generated method stub
//				System.out.println("Show function for Lambda Exprestion");
//			}
//		};
//		obj.show();
		
//		3. without USing Parameter
//		MyInterface obj = () -> {
//			System.out.println("Show functionfor Lambda Expristion");
//		};
//		obj.show();
		
//		4.With same type Parameter
//		MyInterface obj = (s1,s2) -> {
//			System.out.println("Message 1 = "+s1+" : Message 2 = "+s2);
//		};
//		obj.show("Welcome", "Good Bye"); // Calling Message
		
//		5. Differance Parameter
//		MyInterface obj = (s1,x) -> {
	//		System.out.println("Message 1 = "+s1+" : Integer = "+x);
	//	};
	//	obj.show("Welcome", 10); // Calling Message
		
//		6. Return Value
		MyInterface obj = (x,y) -> {
			return x+y;
		};
		System.out.println("Result is : " +obj.add(10.5, 10)); // Calling Message
		
	}

//	public void show() {
//		System.out.println("Show function for Lambda Exprestion");
//		
//	}

}
