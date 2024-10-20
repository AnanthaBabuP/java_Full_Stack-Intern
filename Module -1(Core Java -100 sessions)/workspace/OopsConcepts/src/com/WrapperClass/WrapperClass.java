package com.WrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		int a = 10; // Primitive type
		int b = 20; // primitive Type
		
		System.out.println("Conversion primitive to non-primitive type");
		String s1 = Integer.toString(a); // "10"
		String s2 = Integer.toString(b); // "20"
		
		System.out.println(s1+s2); // "10"+"20" = "1020"
		
		System.out.println("Convert Primitive to Wrapper Class object");
		Integer obj1 = new Integer(25); // Primitive type to wrapper class object using constractor
		Integer obj2 = new Integer(36);
		
	
		System.out.println(obj1+obj2);
		
		System.out.println("Convert wrapper class into primitive Types");
		int x = obj1.intValue();
		int y = obj2.intValue();
		
		System.out.println(x-y);
		
		System.out.println("Converting String into wrapper class object");
		
		obj1 = Integer.valueOf("1081");
		obj2 = Integer.valueOf("2026");
		
		System.out.println(obj1*obj2);
		
		System.out.println("COnverting String to primitive Numbers");
		x = Integer.parseInt("312");
		y = Integer.parseInt("123");
		
		System.out.println(x/y);
		
		Integer obj3 = 34; // Auto Boxing[implicit]
		int i = obj3; // Auto Un-boxing [explicit]
	}

}
