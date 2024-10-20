package com.Abstaction;

public interface Vahicle {
	public void gearUp(int g);
	public void handleBrack(int b);
	public void speedUp(int s);
}

class BiCycle implements Vahicle{
	
	int gear;
	int speed;
	int brack;
	
	public void gearUp(int g) {
		// TODO Auto-generated method stub
		gear =	g;
		speed += 4;
	}
	
	public void handleBrack(int b) {
		// TODO Auto-generated method stub
		brack = b;
		speed -=4;
		
	}
	
	public void speedUp(int s) {
		// TODO Auto-generated method stub
		speed = s;
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Gear = "+gear+" Brack ="+ brack + " Speed = "+speed);

	}
	
}

class Bike implements Vahicle{
	int gear;
	int speed;
	int brack;
	
	public void gearUp(int g) {
		// TODO Auto-generated method stub
		gear =	g;
		speed += 6;
	}
	
	public void handleBrack(int b) {
		// TODO Auto-generated method stub
		brack = b;
		
	}
	
	public void speedUp(int s) {
		// TODO Auto-generated method stub
		speed = s;
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" Speed = "+speed + "Gear = "+gear+" Brack ="+ brack );

	}
}
