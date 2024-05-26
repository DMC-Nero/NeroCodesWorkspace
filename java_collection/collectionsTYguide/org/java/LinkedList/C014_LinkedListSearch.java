package org.java.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*
	
 */

public class C014_LinkedListSearch {

	public static void main(String[] args) {
		
		LinkedList<String> progLangs = new LinkedList<>();
		
		progLangs.add("C");						// 0
		progLangs.add("C++");					// 1
		progLangs.add("Java EE");				// 2
		progLangs.add("Core Java");				// 3
		progLangs.add("Spring Framework");		// 4
		progLangs.add("Spring Framework");		// 5
		progLangs.add("Hibernate Framework");	// 6
		
		boolean result = progLangs.contains("C");
		System.out.println(result);
		
		// Find the index of  the first occurrence of an element in the LinkedList
		int index = progLangs.indexOf("Java EE");
		System.out.println("index = "+index);
		
		// Find the index of the last occurrence of an eleemnt in the LinkedList
		int lastIndex = progLangs.lastIndexOf("Spring Framework");
		System.out.println("lastIndex = "+lastIndex);
		System.out.println("========================");
		
		// iterator
		Iterator<String> progIt = progLangs.iterator();
		while( progIt.hasNext()) {
			String prog = progIt.next();
			System.out.println(prog);
		}
		System.out.println("========================");
		
		// forEach
		progLangs.forEach((element) -> {
			System.out.println(element);
		});
		System.out.println("========================");
		
		// Enhanced for Loop
		for (String x : progLangs) {
			System.out.println(x);
		}
		System.out.println("========================");
		
		// Basic for loop
		for(int i=0 ;i<progLangs.size();i++) {
			System.out.println(progLangs.get(i));
		}
	}

}








