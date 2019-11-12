package com.epam.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperations {
	
	public static void main(String[] args) {
		LinkedList<String> names=new LinkedList<String>();  
		  names.add("aaa");  
		  names.add("bbb");  
		  names.add("ccc");  
		  names.add("ddd"); 
		  Iterator<String> it = names.iterator();
		  
		  while(it.hasNext()){
			  System.out.println(it.next());
		  }
		  
		 System.out.println("****8print elements in reverse order****");
		  System.out.println("FirstElement: " + names.getFirst());
		  System.out.println("LastElement: " + names.getLast());
		  
		   Object[] ar = names.toArray();
		 
		   for (int i=ar.length-1;i>=0;i--){
			   System.out.println(ar[i]);
		   }
		
		
		  
	}

}
