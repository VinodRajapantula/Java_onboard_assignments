package com.epam.hashcodetest;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Student student1 = new Student(1, "aaaa", 5);
		Student student2 = new Student(1, "aaaa", 5);
		
		Set<Student> studentSet =  new HashSet<Student>();
		studentSet.add(student1);
		studentSet.add(student2);
		
		System.out.println(studentSet.size());
	}

}
