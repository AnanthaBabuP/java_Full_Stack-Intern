package com.DownCasting;

public class A {
	void test1() {
		System.out.println("Testing For A Class");
	}
}

class B extends A{
	void test2() {
		System.out.println("Testing For B Class");
	}
}

class C extends A{
	void test3() {
		System.out.println("Testing For C Class");
	}
}
