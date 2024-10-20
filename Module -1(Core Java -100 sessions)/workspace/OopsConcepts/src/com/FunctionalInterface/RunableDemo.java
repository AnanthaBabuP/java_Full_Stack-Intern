package com.FunctionalInterface;

public class RunableDemo{

	public static void main(String[] args) {
		/*Functional Interface
	 		1.Runnable - run()
	 		2.Comparable - compareTo()
	 		3.Comparator - compare()
		 */
//		Runnable obj = new RunableDemo();
//		Thread d = new Thread(obj);
//		d.start();/
		
//		Runnable obj = new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Runable Executed Using Anonymous Inner Class...");
//				
//			}
//		};
//		
//		obj.run();
		
		Runnable obj = () -> 
		{	System.out.println("Entering");
			System.out.println("Run Method Executing...");
		};
		Thread t = new Thread(obj);
		t.start();
//		obj.run();
	}

//	@Override
//	public void run() {
//		System.out.println("run method Executed..");
//		
//	}

}
