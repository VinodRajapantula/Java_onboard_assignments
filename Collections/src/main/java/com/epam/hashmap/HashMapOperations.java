package com.epam.hashmap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapOperations {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("aaa", 1);
		map.put("bbb", 2);
		map.put("ccc", 3);
		
		System.out.println(map);
		
		// getting all the keys
		
		Set<String> keySet = map.keySet();
		System.out.println("All keys: " + keySet);
		Collection<Integer> array =  map.values();
		System.out.println(array);
		
		for (Map.Entry m:map.entrySet()){
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
		

	}

}
