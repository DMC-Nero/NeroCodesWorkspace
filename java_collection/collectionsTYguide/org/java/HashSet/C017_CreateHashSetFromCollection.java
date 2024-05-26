package org.java.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 	1. Create a HashSet from another collection using the HashSet(Collection c) constructor.
 	2. Add all the elements from a collection to the HashSet using the addAll() method.
 */
public class C017_CreateHashSetFromCollection {

	public static void main(String[] args) {
		
		// First 5 even numbers
//		List<Integer> first5Even = new ArrayList<>();		// possible
		Set<Integer> first5Even = new HashSet<>();
		first5Even.add(2);
		first5Even.add(4);
		first5Even.add(6);
		first5Even.add(8);
		first5Even.add(10);
	
	// 1. Create a HashSet from another collection using the HashSet(Collection c) constructor.
		Set<Integer> first10Even = new HashSet<>(first5Even);
		System.out.println(first10Even);
		
		Set<Integer> next5Even = new HashSet<>();
//		List<Integer> next5Even = new ArrayList<>();		// possible
		next5Even.add(12);
		next5Even.add(14);
		next5Even.add(16);
		next5Even.add(18);
		next5Even.add(20);
	
	// 2. Add all the elements from a collection to the HashSet using the addAll() method.
		first10Even.addAll(next5Even);
		System.out.println(first10Even);
		
	}

}
