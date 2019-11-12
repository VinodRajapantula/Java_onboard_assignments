package com.epam.abstractfactory;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {		
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		
		if (shape.equalsIgnoreCase("Cirlcle")){
			return new Circle();
		}else if (shape.equalsIgnoreCase("Square")){
			return new Square();
		}else{
			return null;
		}	
		
	}
	
}
