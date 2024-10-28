package com.demo.spring.WorkingWithSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	@Value("Dell")
	private String companyName;
	
	@Value("79000")
	private double price;
	
	@Autowired
	private Moniter monit;
	
	// Setter Base DI(Dependency Injection)
	public Computer() {
		System.out.println("Computer Constructer Created...");
	}
	
	public Computer(Moniter monit) {
		super();
		this.monit = monit;
	}



	public void display(){
		if(monit != null) {
			System.out.println("Moniter Working Fine...");
			monit.displayMoniter();
		} else {
			System.out.println("Moniter Working Not Fine...");
		}
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	// Setter Base DI(Dependency Injection)
//	public void setMonit(Moniter monit) {
//		this.monit = monit;
//	}
	
}
