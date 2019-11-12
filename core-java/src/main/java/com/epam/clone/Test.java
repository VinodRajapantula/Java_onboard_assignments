package com.epam.clone;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Singleton s1 = Singleton.getSingletonObj();
		//s1.clone() //-> gives error as Singleton does not implemented Cloneable  interface
		
		
		
		A a = new A();
		A b = (A) a.clone();
	}

}
