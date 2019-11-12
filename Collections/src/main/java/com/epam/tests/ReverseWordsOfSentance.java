package com.epam.tests;

public class ReverseWordsOfSentance {

	public static void main(String[] args) {
		String str = "This world is good";
		String reverseStr="";
		
		String[] strArray = str.split("\\s");
		for (int i=0;i<strArray.length;i++){
			StringBuffer sb = new StringBuffer(strArray[i]);
			reverseStr = reverseStr+ sb.reverse().toString() + " ";
		}
		
		System.out.println(reverseStr);

	}

}
