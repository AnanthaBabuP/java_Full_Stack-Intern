package com.InnerClass;


class A{
	private static int x;

	public A(int x) {
		this.x = x;
	}
	
	// Inner Class = With out using static keyword
	// Nested Class = With using static keyword
	static class B{
		public void display() {
			System.out.println("A Class X Value is "+x);
		}
	}
	
}
public class InnerClass_Example {

	public static void main(String[] args) {
//		// InnerClass Object Creation And method Calling
//		A a= new A(25);
//		A.B b= a.new B(); // OuterClass Object.new InnerClassName();

		// Nested Class Object Creation And method Calling
		// Static InnerClass is Called Nested Class
		A a= new A(25);
		A.B b= new A.B(); // OuterClassName.InnerClassName = new OuterClassName.InnerClassName();
		b.display();
	}

}
