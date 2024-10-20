package ExceptionPropagation4;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Main method is calling...");
		try{
			method1();
		} catch(ArithmeticException e) {
			System.out.println("Exception Handle Main");
			System.out.println(e.getMessage());
		}
	}
		

	private static void method1() {
		System.out.println("Method 1 here");
		method2();
	}
	
	private static void method2() {
		System.out.println("Method 2 here");
		method3();
	}
	
	private static void method3() {
		System.out.println("Method 3 here");
		int a = 10/0;
	}

}
