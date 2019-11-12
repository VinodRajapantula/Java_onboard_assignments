package com.epam.singleton;

import java.awt.image.SinglePixelPackedSampleModel;

import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getSingleton();
		Singleton obj2 = Singleton.getSingleton();
		
		if (obj1 == obj2){
			System.out.println("Same");
		}
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		if (s1 == s2){
			System.out.println("student objects are same");
		}else{
			System.out.println("student objects are not same");
		}
		
		WebDriver driver1 = obj1.getDriver();
		driver1.get("https://dev92249.service-now.com/");
		WebDriver driver2 = obj1.getDriver();
		System.out.println(driver2.getTitle());
		
		
		
		
	}

}
