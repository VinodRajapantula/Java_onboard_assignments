package com.epam.staticPloymorphism;

public class Test {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.draw();
		circle.draw("Red");
		circle.draw("Blue", 5);
	}

}
