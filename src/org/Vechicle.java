package org;


public class Vechicle {
	void start() {
		System.out.println("Startig vechicle");
	}
}
class Car extends Vechicle{
	@Override
	void start() {
		super.start();
		
		System.out.println(" Car Started");
	}
}
class Bike extends Car{
	@Override void start() {
		super.start();
		
		
		System.out.println("Bike Started");
			
	}
}