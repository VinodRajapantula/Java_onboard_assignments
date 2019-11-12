package com.epam.stringcompare;

public class Tests {
	
	public static void main(String[] args) {
		//String s1="aaa";
		//String s2="aaa";
		
		String s1 = new String("aaa");
		String s2 = new String("aaa");
		if (s1==s2){
			System.out.println("s1==s2");
		}else{
			System.out.println("s1!=s2");
		}
		
		if (s1.equals(s2)){
			System.out.println("s1 equlal to s2");
		}else{
			System.out.println("s1 not equlal to s2");
		}
		
	}
}
