package org.java.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 	1. Java HashMap is a hash table based implementation of Java's Map interface
 	2. A HashMap cannot contain duplicate keys.
 	3. Java HashMap allows null values and a single null key.
 	4. HashMap is an unordered collection. it does not guarantee any specific order of the elements.
 	5. Java HashMap is not thread-safe. You must explicitly synchronize concurrent modifications to the HashMap
 
 */
public class C020_HashMapDemo {

	public static void main(String[] args) {
		
		// example to map numbers to string
		Map<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		
		map.put(null, 6);
		map.put(null, 7);
		
		System.out.println(map);
		
	// Check if a HashMap is empty
		System.out.println(map.isEmpty());
		
	// Find the size of a HashMap
		System.out.println(map.size());
		
	// Check if a key exists in the HashMap
		if(map.containsKey("Four")) {
			System.out.println("Exist");
		}else {
			System.out.println("Not Exist");
		}
		
	// 	Check if a value exist in a HashMap
		if(map.containsValue(6)) {
			System.out.println("Exist");
		} else {
			System.out.println("Not Exist");
		}
		
	// Get value by key
		Integer v1 = map.get("One");
		System.out.println(v1);
		
	// How to remove keys from HashMap
		map.remove("Two");
		System.out.println(map);
		
	// How to get only keys from HashMap
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
	// How to get only values from HashSet
		Collection<Integer> values = map.values();
		System.out.println(values);
	}

}








