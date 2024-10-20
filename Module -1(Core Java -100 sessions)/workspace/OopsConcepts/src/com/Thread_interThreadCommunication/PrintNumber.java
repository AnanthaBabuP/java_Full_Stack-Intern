package com.Thread_interThreadCommunication;

public class PrintNumber {
	boolean flag = false;
	public synchronized void printOdd(int number) {
		while(flag) {
			try {
				wait();
//				System.out.println("Odd Number is Waiting");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Odd :"+number);
		flag= true;
		notify();
	}
	
	public synchronized void printEven(int number) {
		
		while (!flag) {
			try {
				wait();
				// System.out.println("Even Number is Waiting");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Even : "+number);
		flag= false;
		notify();
	}

}
