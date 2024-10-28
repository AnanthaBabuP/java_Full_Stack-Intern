package com.demo.spring.WorkingWithSpring.DI;

public class Bike implements Vachile{
	public Bike() {
		System.out.println("Bike Created..");
	}
	
	public void ride() {
		System.out.println("Bike Riding...");
	}
}
