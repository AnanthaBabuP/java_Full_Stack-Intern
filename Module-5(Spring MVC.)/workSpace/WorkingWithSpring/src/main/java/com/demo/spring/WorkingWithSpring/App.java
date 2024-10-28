package com.demo.spring.WorkingWithSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.WorkingWithSpring.ConstructorBean.Book;
import com.demo.spring.WorkingWithSpring.DI.Vachile;

public class App {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
//		Bank bank = context.getBean(Bank.class);
//
//		bank.deposit(253.32);
//
//		/* Constructor Based Bean */
//		ApplicationContext ab = new ClassPathXmlApplicationContext("Bean.xml");
//		Book book = ab.getBean(Book.class);
//		book.display();
//
//		/* Setter Base Bean Initialization */
//		com.demo.spring.WorkingWithSpring.SetterBean.Book setterBook = ab
//				.getBean(com.demo.spring.WorkingWithSpring.SetterBean.Book.class);
//
//		setterBook.display();
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
//		Vachile v = context.getBean(Vachile.class);
//		v.ride();
		
		// Setter Base DI(Dependency Injection)
		ApplicationContext apc = new ClassPathXmlApplicationContext("DIAnotation.xml");
		Computer c = apc.getBean(Computer.class);
		c.display();
	}
}
