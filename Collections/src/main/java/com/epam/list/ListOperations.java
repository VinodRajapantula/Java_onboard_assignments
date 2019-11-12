package com.epam.list;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(1);
		list.add(3);
		
		System.out.println("*****will get all in natural inserting order. Prserves the insertion order*****");
		for (int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("******adding at given index.. all the other elements still remains in list*****");
		list.add(0,5); 
		
		for (int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("****Replacing a existing value in list****");
		
		list.set(0, 7); 
		
		for (int i=0;i<list.size();i++){
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("****Get Index. Used to search for element in list****");
		
		System.out.println("Index of 1: "+ list.indexOf(1));
		System.out.println("Index of 9, as its is not existing in list is : " + list.indexOf(9));
		
		System.out.println();
		System.out.println("****Remove element****");
		list.remove(1);
		//list.remove(index);
		for(int i: list){
			System.out.print(i + " ");
		}
		
		
		

	}

}
