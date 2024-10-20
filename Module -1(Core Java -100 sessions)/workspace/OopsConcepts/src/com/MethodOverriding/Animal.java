package com.MethodOverriding;

public class Animal {

	void moving() {
		System.out.println("Animals are Moving...");
	}
}

class Dog extends Animal{ // subclass-1
	void moving() {
		System.out.println("Dogs are Moving...");
	} 
}

class Snake extends Animal{ // subclass-2
	void moving() {
		System.out.println("Snakes are Moving...");
	}
}
