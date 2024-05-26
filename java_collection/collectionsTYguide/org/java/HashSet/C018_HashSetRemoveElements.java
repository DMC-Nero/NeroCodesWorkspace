package org.java.HashSet;

import java.util.HashSet;
import java.util.Set;

/*
  	1. remove() method - Remove an element from a HashSet.
  	2. removeAll() method - Remove all the elements that exist in a given collection from the HashSet.
  	3. clear() method - clear the HashSet completely by removing all the elements.
 */

public class C018_HashSetRemoveElements {

	public static void main(String[] args) {
		
		// Creating HashSet
		Set<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		System.out.println("Initial set -> "+ numbers);
		
	// 1. remove() method - Remove an element from a HashSet.
		boolean result = numbers.remove(1);
		System.out.println("remove() method result -> "+ result);
		System.out.println(numbers);
		
	// 2. removeAll() method - Remove all the elements that exist in a given collection from the HashSet.
		Set<Integer> even = new HashSet<>();
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		even.add(10);
		
		numbers.removeAll(even);
		System.out.println("after removing even Set -> " + numbers);
		
	// 3. clear() method - clear the HashSet completely by removing all the elements.	
		numbers.clear();
		System.out.println("after using clear() method -> "+ numbers);
	}

}
