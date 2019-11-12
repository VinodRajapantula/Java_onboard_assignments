package com.epam.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singleton {
	
	
	private static Singleton singleton;
	private WebDriver driver;
	
	private Singleton(){
		System.out.println("Singleton object created");
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	public static Singleton getSingleton(){
		if (singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public WebDriver getDriver(){
		return driver;
	}
	
	
}
