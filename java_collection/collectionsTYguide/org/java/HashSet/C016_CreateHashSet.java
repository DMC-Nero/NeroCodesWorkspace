package org.java.HashSet;

import java.util.HashSet;
import java.util.Set;


public class C016_CreateHashSet {

	public static void main(String[] args) {
		// create a HashSet using the HashSet() constructor
		// add new elements to it using the add() method.
		
		// unordered collection
		Set<String> progLang = new HashSet<>();
		progLang.add("c");
		progLang.add("c++");
		progLang.add("Java");
		progLang.add("Scala");
		progLang.add("Python");
		progLang.add("JavaScript");
		System.out.println(progLang);
		
		// let's add duplicate element
		progLang.add("Java");
		System.out.println(progLang);
	}

}
