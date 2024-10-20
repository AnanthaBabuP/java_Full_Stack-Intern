package com.InnerClass;

public class Test {

//	@Override
//	public void m1() {
//		System.out.println("M1 Calling...");
//		
//	}
	
	public static void main(String[] args) {
//		Interface_Anonymous i = new Test(); // UpCasting
		
		// Using Anonymous InnerClass
		Interface_Anonymous i  = new Interface_Anonymous() {
			
			@Override
			public void m1() {
				System.out.println("M1 Calling Using Anonymous Inner Class...");
				
			}
			
			@Override
			public void m2() {
				System.out.println("M2 Calling Using Anonymous Inner Class...");
				
			}
		};
		
		i.m1();
		i.m2();
	}
	
}
