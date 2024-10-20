package com.ExceptionHandling;

import java.io.DataInputStream;
import java.io.IOException;

public class ExceptionHandlingDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Hellow");
		
		int a,b;
		DataInputStream dis = new DataInputStream(System.in);
		a= Integer.parseInt(dis.readLine());
		b = Integer.parseInt(dis.readLine());
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a/b); // 10/0 [Infinitive]
		
		m1(); // stack Overflow Error

	}
	
	static void m1() {
		m1();
		System.out.println("Hellow");
	}
}
