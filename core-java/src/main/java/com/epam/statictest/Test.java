package com.epam.statictest;

public class Test {
	public static int i;
	public static void main(String[] args) {
		
		Car car = new Car("Red","Ford",4500);
		//Static variable, method calling with Car object
		System.out.println("Wheel Count:" + car.wheelCount);
		car.driving();
		
		//Static variable, method calling with Class name
		System.out.println("Wheel Count:" + Car.wheelCount);
		Car.driving();
		
		car.display();
		
	}
	
	
	
	
}
