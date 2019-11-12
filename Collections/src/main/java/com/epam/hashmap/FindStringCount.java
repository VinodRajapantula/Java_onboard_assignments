package com.epam.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class FindStringCount {

	public static void main(String[] args) {
		
		// Find each string occurrence in give word
		String sentance = "aaa bb ccc aaa ccc bb dd";
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		
		String[] strArray =  sentance.split("\\s");
		
		System.out.println("Total Number of words: " + strArray.length);
		
		for (String str : strArray){
			
			if (map.containsKey(str)){
				map.put(str, map.get(str)+1);
			}else{
				map.put(str, 1);
			}
		}
		
		for (Map.Entry m : map.entrySet()){
			System.out.println(m.getKey() +" : " + m.getValue());
		}
		
		

	}

}
