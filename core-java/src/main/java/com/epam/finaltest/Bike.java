package com.epam.finaltest;

public class Bike {
	
	public final int speedLimit = 100;
	
	public final void ride(){
		System.out.println("Bike is raiding");
		
		//speedLimit = 110; -> Can not change final variable value. 
		
	}

}
