package com.epam.enumtest;

enum Day 
{ 
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY; 
} 

public class DayTest {
	
	public static void main(String[] args) {
		
		//Day day = Day.valueOf("MONDAY");
		System.out.println(Day.FRIDAY);
		System.out.println("*******************");

		// Read all the values from enum with ordinal values
		Day[] dayArray = Day.values();
		
		for (Day day: dayArray){
			System.out.println(day + "  --- Ordinal: " + day.ordinal());
		}
		System.out.println("*******************");
		
	
		// passing enum as parameter to switch statement
		Day day = Day.MONDAY;
		switch (day) {
		case SUNDAY:System.out.println("this is sunday");			
			 break;
		case MONDAY:System.out.println("this is monday");			
		 	 break;	 
		default:
			break;
		}
		
	}
}
