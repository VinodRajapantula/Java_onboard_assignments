package com.epam.builder;

public class Shop {

	public static void main(String[] args) {
			
		//Phone phone = new Phone("Ios", "Quallcom", 2, 5, 3100);
		Phone phone = new PhoneBuilder().setOs("Ios").getPhone();
		System.out.println(phone);		
	}

}
