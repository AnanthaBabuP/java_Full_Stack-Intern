package com.MultiThreading.MainMultithreading;

public class MainMultiThreadDemo {

	public static void main(String[] args) {
		
		try {
			
			int priority=Thread.MAX_PRIORITY; //10
//			int minPriority = Thread.MIN_PRIORITY;// 1
//			int normPriority = Thread.NORM_PRIORITY;// 5
			System.out.println("proiority : "+ priority);
			Thread t;
			Runnable obj1 = new MainThreadDemo("Thread-1" ,Thread.MAX_PRIORITY); // Object Creation
			Thread t1 = new Thread(obj1);
			t1.start();
			
			Runnable obj2 = new MainThreadDemo("Thread-2",Thread.MIN_PRIORITY); // Object creation
			Thread t2 = new Thread(obj2);
			t2.start();
			
			Runnable obj3 = new MainThreadDemo("Thread-3",Thread.NORM_PRIORITY); // Object Creation
			Thread t3 = new Thread(obj3);
			t3.start();
			
			System.out.println(t1.getName()+ " Is alive = "+t1.isAlive()); // true
			System.out.println(t1.getName()+ " Is alive = "+t1.isAlive()); // true
			System.out.println(t1.getName()+ " Is alive = "+t1.isAlive()); // true
			
			t1.join();
			t2.join();
			t3.join();
			
			System.out.println(t1.getName()+ " Is alive = "+t1.isAlive()); // false
			System.out.println(t1.getName()+ " Is alive = "+t1.isAlive()); // false
			System.out.println(t1.getName()+ " Is alive = "+t1.isAlive()); // false
			
			System.out.println("Thread "+Thread.currentThread().getName() + " Start");
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName() +i);
				Thread.sleep(1000);
			}
			System.out.println("Thread "+ Thread.currentThread().getName()+" End");
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
