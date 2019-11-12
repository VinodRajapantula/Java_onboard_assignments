package com.epam.abstracttest;

abstract class Animal {
	public abstract void animalSound();

	public void sleep() {
		System.out.println("Animal Sleeping");
	}
}

class Pig extends Animal {

	@Override
	public void animalSound() {
		System.out.println("The pig is sounding");

	}

}

public class Test {

	public static void main(String[] args) {
		Animal myPig = new Pig(); 
		
		//Pig myPig = new Pig(); 
		myPig.animalSound();
		myPig.sleep();
	}

}
