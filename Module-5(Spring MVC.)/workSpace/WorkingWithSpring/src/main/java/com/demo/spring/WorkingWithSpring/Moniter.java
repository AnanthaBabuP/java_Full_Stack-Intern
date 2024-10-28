package com.demo.spring.WorkingWithSpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Moniter {

	@Value("32")
	private int size;
	
	@Value("1024")
	private int resolution;
	// Default Constructor
	public Moniter() {
		System.out.println("Moniter Constructer Calling...");
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	
	public void displayMoniter() {
		System.out.println("Display Size : "+size+" \n Resolution : "+resolution);
	}
	
}
