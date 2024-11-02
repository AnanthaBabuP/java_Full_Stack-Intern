package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);
		System.out.println("SpringBoot Project run Successfully..");
	
//		Book b1 = new Book(); // Tightly coupled
//		b1.display();
		
		// Single ton Object creation
//		Book b1 = context.getBean(Book.class);
//		b1.display();
//		
//		Book b2 = context.getBean(Book.class);
//		b2.display();
		
		// Prototype Object creation
		Book_prototype bp1 = context.getBean(Book_prototype.class);
		bp1.display();
		
		Book_prototype bp2 = context.getBean(Book_prototype.class);
		bp2.display();
		
	}

}
