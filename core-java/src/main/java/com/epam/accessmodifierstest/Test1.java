package com.epam.accessmodifierstest;

public class Test1 {

	public static void main(String[] args) {
		Modifier modifier = new Modifier();
		
		//System.out.println(modifier.eno); // As private can not access outside class
		System.out.println(modifier.ename); // default can be accessed within package
		System.out.println(modifier.salary);// protected can be accessed within package 
		System.out.println(modifier.deptarment); // public can be accessed within project

	}

}
