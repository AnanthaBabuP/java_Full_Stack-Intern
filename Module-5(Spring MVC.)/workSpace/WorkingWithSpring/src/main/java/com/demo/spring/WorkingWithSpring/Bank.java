package com.demo.spring.WorkingWithSpring;

public class Bank {

	public Bank() {
		System.out.println("Bank Object Created..");
	}

	public void deposit(double val) {
		System.out.println("Deposit Sucessful....");
		System.out.println("AMpount :" + val + " Rupees");
	}

}
