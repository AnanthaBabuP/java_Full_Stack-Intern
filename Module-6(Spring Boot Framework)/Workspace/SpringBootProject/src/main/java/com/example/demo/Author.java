package com.example.demo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("authorQualifer")
public class Author implements Serializable{

	@Value("101")
	private int author_id;
	@Value("Kalki")
	private String author_name;
	@Value("Tenkasi")
	private String address;
	
	
	public Author() {
		System.out.println("Author Object Created...");
	}	
	
	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Author Id : "+author_id);
		System.out.println("Author Name : "+author_name);
		System.out.println("Author Address : "+address);
	}
	
	
}
