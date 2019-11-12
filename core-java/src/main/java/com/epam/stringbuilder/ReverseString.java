package com.epam.stringbuilder;

public class ReverseString {
	public static void main(String[] args) {
		
		String str1="Vinod";
		StringBuffer str2= new StringBuffer(str1);
		str2 = str2.reverse();
		System.out.println(str2);
		
		//second way
		
		char[]  ca = str1.toCharArray();
		String reverseStr = "";
		for(int i=0;i<ca.length;i++){
			reverseStr = reverseStr + ca[i];
		}
		System.out.println(reverseStr);
	}
}
