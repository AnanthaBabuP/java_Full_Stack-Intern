package com.DownCasting;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new B(); // Upcasting
		a1.test1();
		
		B b1 = (B)a1; // Downcasting
		b1.test1();
		b1.test2();
		
		C c = (C)a1;
		c.test1();
		c.test3();
	}

}
