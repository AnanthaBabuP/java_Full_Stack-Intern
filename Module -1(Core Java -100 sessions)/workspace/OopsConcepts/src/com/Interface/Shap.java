package com.Interface;

public interface Shap extends Shap2,Shap3 {
	//	public static final double pi = 3.15;
	double pi = 3.15;
	
	public abstract void shap_radious();
	
}

class Circle implements Shap,Shap2{
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void shap_radious() {
		// TODO Auto-generated method stub
		System.out.println("Shap of Circle is "+(pi*radius*radius));
	}

	public void shap_Valume() {
		// TODO Auto-generated method stub
		System.out.println("Valume fo Circle is "+((4*pi*radius*radius*radius)/3));
		
	}
	
}

class Square implements Shap, Shap2{
	double l;
	
	public Square(double l) {
		this.l = l;
	}
	
	public void shap_radious() {
		// TODO Auto-generated method stub
		System.out.println("Shap of Square is "+(l*l));
	}

	public void shap_Valume() {
		// TODO Auto-generated method stub
		System.out.println("Valume of Square is "+(l*l*l));
	}
	
}

class Rectangle extends Shap3d implements Shap, Shap2{
	double l,b,h;
	
	public Rectangle(double l,double b) {
		this.l = l;
		this.b = b;
	}
	
	public Rectangle(double l,double b,double h) {
		this.l = l;
		this.b = b;
		this.h = h;
	}
	
	public void shap_radious() {
		// TODO Auto-generated method stub
		System.out.println("Shap of Rectanle is "+(l*b));
	}

	public void shap_Valume() {
		// TODO Auto-generated method stub
		System.out.println("Valume of Rectanle is "+(l*b*h));
	}
	
}