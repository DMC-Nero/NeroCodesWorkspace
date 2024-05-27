package org.java.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C021_IterateHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		
	// for each mehtod
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key -> "+ entry.getKey() + "\t value -> "+entry.getValue());
		}
		
		System.out.println("============================");
	// using iterator
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("Key -> "+ entry.getKey() + " \t Value -> "+ entry.getValue());
		}
		System.out.println("============================");
		
	// using java 8 forEach
		map.forEach((K, V) ->  {
			System.out.print("key -> "+ K);
			System.out.println("\t Value -> "+ V);
		});
		
	}

}
