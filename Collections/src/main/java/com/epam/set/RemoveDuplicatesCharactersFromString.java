package com.epam.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesCharactersFromString {

	public static void main(String[] args) {
		String str = "aabcaddc";
		String unique="";
		//**************************
		char[] charArray = str.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (int i=0;i<charArray.length;i++){
			list.add(charArray[i]);
		}
		System.out.println("character in string: " + list);
		Set set = new HashSet<Character>(list);
		System.out.println("Unique characters in String: " + set.toString());
		
		//********************************
		Set charSet = new HashSet<Character>();
		
		for (int i=0;i<str.length();i++){
			if(charSet.add(str.charAt(i))){
				unique = unique+str.charAt(i);
			}
		}
		
		System.out.println("Unique characters in String: "+charSet);
		
		
		

	}

}
