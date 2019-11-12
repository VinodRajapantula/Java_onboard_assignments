package com.epam.statictest;

public class Car {
	
	
    private String color;
	private String model;
	private int  price;
	public static int wheelCount = 4;
	
	public String getColor() {
		return color;
	}
	
	public Car(String color, String model, int price) {
		this.color = color;
		this.model = model;
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static void  driving(){
		System.out.println("Driving Car");
	}
	
	public void display(){
		System.out.println("color: " + color);
		System.out.println("model: " + model);
		System.out.println("price: " + price);
		System.out.println("wheelCount: " + wheelCount);
	}
	
	

}
