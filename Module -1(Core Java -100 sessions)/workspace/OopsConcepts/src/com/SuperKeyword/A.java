package com.SuperKeyword;

public class A {
	int i = 100;
	public A() {
		System.out.println("A class constractor");
	}
	
	void display() {
		System.out.println("A Class Method");
	}
}
class B extends A{
	int i = 10;
	
	B(){
		super(); // Calling Super class Constr ctor
		System.out.println("B Class Constracctor");
	}
	
	void display() {
		super.display(); // Calling Super Class display method
		System.out.println("Super Class Veriable i = "+super.i);
		System.out.println("Sub Class Veriable i = "+i);
		System.out.println("B  Class Method");
	}
}
