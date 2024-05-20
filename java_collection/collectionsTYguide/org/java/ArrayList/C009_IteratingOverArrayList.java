package org.java.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C009_IteratingOverArrayList {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("C", "C++", "Java", "Python", "Hibernate");
		
	// basic for loop
		for (int i = 0; i < courses.size() ; i++) {
			System.out.println(courses.get(i));
		}
	// Enhanced for each loop
		for (String course : courses) {
			System.out.println(course);
		}
	// basic loop with iterator
		for( Iterator iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
	// iterator with while loop
		Iterator<String> it = courses.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	// java 8 stream + lambda example
		courses.stream().forEach(course -> System.out.println(course));

	// java 8 forEach + lambda
		courses.forEach((course) -> System.out.println(course));
	}
	
}
