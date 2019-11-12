package com.epam.tests;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str="Vinod";
		String reverse = "";
		String reverse1 = "";
		//Method1
		StringBuffer sb = new StringBuffer(str);
		reverse = sb.reverse().toString();
		System.out.println(reverse);
		
		//Method2
		
		for (int i=str.length()-1;i>=0;i--){
			reverse1 = reverse1 + str.charAt(i);
		}
		
		System.out.println(reverse1);
		
	}

}
