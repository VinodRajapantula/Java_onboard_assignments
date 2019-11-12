package com.epam.builder;

public class Phone {
	private String os;
	private String processer;
	private int ram;
	private double screenSize;
	private int battery;
	
	public Phone(String os, String processer, int ram, double screenSize, int battery) {
		super();
		this.os = os;
		this.processer = processer;
		this.ram = ram;
		this.screenSize = screenSize;
		this.battery = battery;
	}
	
	
	@Override
	public String toString() {
		return "Phone [os=" + os + ", processer=" + processer + ", ram=" + ram + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}
	
	
	
}
