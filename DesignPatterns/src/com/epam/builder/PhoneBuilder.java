package com.epam.builder;

public class PhoneBuilder {
	private String os;
	private String processer;
	private int ram;
	private double screenSize;
	private int battery;
	
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcesser(String processer) {
		this.processer = processer;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone(){
		return new Phone(os, processer, ram, screenSize, battery);
	}
	
	
}
