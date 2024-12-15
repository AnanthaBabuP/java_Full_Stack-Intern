package Main;

class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed by the thread
        System.out.println("Hello from thread: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start(); // Start the threads
        thread2.start();
    }
}