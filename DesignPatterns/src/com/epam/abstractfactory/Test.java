package com.epam.abstractfactory;

public class Test {

	public static void main(String[] args) {
		
	AbstractFactory abstractFactory = 	FactoryProducer.getFactory("color");
	abstractFactory.getColor("Red").fill();
	
	FactoryProducer.getFactory("color").getColor("blue").fill();
	
	FactoryProducer.getFactory("shape").getShape("square").draw();

	}

}
