package com.epam.staticPloymorphism;

public class Circle {
	
	public void draw(){
		System.out.println("Drawing circle with default color and radius");
	}
	
	public void draw(String color){
		System.out.println("Drawing circle with "+ color + " and default radius");
	}
	
	public void draw(String color, int radius){
		System.out.println("Drawing circle with "+ color + " and radius " + radius);
	}

}
