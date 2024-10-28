package com.aop.demo.WorkingWithAOP;

import org.springframework.stereotype.Component;

@Component
public class Inmakes {

	public void displayCourse(String course,double price) {
		System.out.println("Inmakes All Courses  = "+ course +"\nAmount = "+price);
	}
	
	public void displaySecurity() {
		System.out.println("Security Invoked...");
	}
	
	public int getAmount(int amount) {
		return amount;
	}
}
