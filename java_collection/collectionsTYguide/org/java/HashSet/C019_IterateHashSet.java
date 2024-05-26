package org.java.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 	1. Enhanced for loop
 	2. Basic loop with iterator
 	3. While loop with iterator
 	4. JDK 8 forEach() method with lambda
 	5. JDK 8 streaming + forEach() + lambda 
 */

public class C019_IterateHashSet {

	public static void main(String[] args) {
		Set<String> courses = new HashSet<>();
		courses.add("C");
		courses.add("C++");
		courses.add("Java");
		courses.add("Python");
		courses.add("JavaScript");
		
	// 1. Enhanced for loop
		for ( String course : courses) {
			System.out.println(course);
		}
		System.out.println("==============");
		
	// 2. Basic loop with iterator
		for (Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		System.out.println("==============");
		
	// 3. While loop with iterator
		Iterator<String> iterator = courses.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("==============");
	
	// 4. JDK 8 forEach() method with lambda
		courses.forEach(course -> System.out.println(course));
		System.out.println("==============");
		
	// 5. JDK 8 streaming + forEach() + lambda 
		courses.stream().filter(course -> !"Python".equals(course))
		.forEach(course -> System.out.println(course));
	}

}
