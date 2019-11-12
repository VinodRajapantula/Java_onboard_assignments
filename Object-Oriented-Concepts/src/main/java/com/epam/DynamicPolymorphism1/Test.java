package com.epam.DynamicPolymorphism1;

public class Test {

	public static void main(String[] args) {
		
		Draw c =  new Circle();
		c.draw();
		
		Draw s =  new Square();				
		s.draw();

	}

}
