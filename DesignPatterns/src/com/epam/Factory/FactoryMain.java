package com.epam.Factory;

public class FactoryMain {

	public static void main(String[] args) {
		OsFactory factory = new OsFactory();
		OS obj = factory.getInstance("window");
		obj.spec();

	}

}
