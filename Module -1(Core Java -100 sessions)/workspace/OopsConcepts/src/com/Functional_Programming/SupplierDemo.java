package com.Functional_Programming;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {
	public static void main(String[] args) {
		
		Supplier<String> str = new SupplierDemo();
		System.out.println("Message="+str.get());
	}
	
	
	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Welcome";
	}

}
