package org.java.HashSet;

import java.util.HashSet;

/*
 	1. HashSet cannot contain duplicate values.
 	2. HashSet allows only one null value.
 	3. HashSet is an unordered collection, it does not maintain the order in which the elements are inserted.
 	4. HashSet internally uses a HashMap to store its elements.
 	5. HashSet is not thread-safe. If multiple threads try to modify a HashSet at the 
 	   same time, then the final outcome is not-deterministic. You must explicitly 
 	   synchronize concurrent access to a HashSet in a multi-threaded environment.
 */
public class C015_HashSetDemo {

	public static void main(String[] args) {
		duplicateValueDemo();
		nullValue();
		unorderedSet();
	}

// 1. HashSet cannot contain duplicate values.
	private static void duplicateValueDemo() {
		HashSet<String> set = new HashSet<>();
		set.add("element1");
		set.add("element1");
		System.out.println(set.toString());
	}
	
// 2. HashSet allows only one null value.
	private static void nullValue() {
		HashSet<String> set = new HashSet<>();
		set.add(null);
		set.add(null);
		System.out.println(set.toString());
	}
	
// 3. HashSet is an unordered collection, it does not maintain the order in which the elements are inserted.
	private static void unorderedSet() {
		HashSet<String> set = new HashSet<>();
		set.add("Zero");
		set.add("Hero");
		set.add("Nero");
		System.out.println(set.toString());
	}

}
