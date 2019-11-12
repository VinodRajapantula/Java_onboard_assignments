package com.epam.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetOperations {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("b");
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		
		
		System.out.println(set.toString());
		
		Iterator<String> it = set.iterator();
		
		/*while (it.hasNext()){
			System.out.println(it.next());
		}*/
		
		System.out.println("Size: " + set.size());
		set.remove("a");
		System.out.println("Size: " + set.size());
		
		List list = new ArrayList();
		list.add("b");
		
		// Removing element from set which are there in list  
		set.removeAll(list);
		System.out.println("Size: " + set.size());
		
		// Removing all the elements from set
		//set.clear();
		
		// creating another set from existing set
		System.out.println("Set1: " + set.toString());
		Set<String> set2 = new HashSet<String>(set);
		System.out.println("Set2: " + set2.toString());
		
		
		 
		
		
		
	}

}
