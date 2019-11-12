package com.epam.comparatortest;

import java.util.ArrayList;
import java.util.Collections;

public class SortingTest {
	
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student(1,"aaa",5);
		Student student2 = new Student(2,"bbb",5);
		Student student3 = new Student(3,"bbb",5);
		
		studentList.add(student3);
		studentList.add(student2);
		studentList.add(student1);
		System.out.println("*********Before sorting************");
		for (int i=0;i<studentList.size();i++){
			System.out.println(studentList.get(i));
		}
		
		Collections.sort(studentList, new SortBySno());
		
		System.out.println("*********After sorting************");
		for (int i=0;i<studentList.size();i++){
			System.out.println(studentList.get(i));
		}
		
		
		
	}

}
