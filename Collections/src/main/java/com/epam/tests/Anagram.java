package com.epam.tests;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Str1");
		String str1 = scanner.next();
		System.out.println("Enter Str2");
		String str2 = scanner.next();
		/*String str1 = "hello";
		String str2 = "llheo";*/
		
		Set<Character> set1 = new HashSet<Character>();
		for (int i=0;i<str1.length();i++){
			set1.add(str1.charAt(i));
		}
		
		Set<Character> set2 = new HashSet<Character>();
		for (int i=0;i<str2.length();i++){
			set2.add(str2.charAt(i));
		}
		
		if (set1.equals(set2)){
			System.out.println("Anagrams");
		}else{
			System.out.println("Not anagrams");
		}
		
		

	}

}
