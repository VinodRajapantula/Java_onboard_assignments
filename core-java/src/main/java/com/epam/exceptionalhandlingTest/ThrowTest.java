package com.epam.exceptionalhandlingTest;

public class ThrowTest {
	
	public void m1() {
		
		int i=10;
		if (i<=10){
		     throw new ArithmeticException("This my own exception");
		}
	}
	public static void main(String[] args){
		ThrowTest throwTest = new ThrowTest();
		try{
			throwTest.m1();
		}catch(Exception e){
			System.err.println("In main: " + e.getMessage());
		}
	}

}
