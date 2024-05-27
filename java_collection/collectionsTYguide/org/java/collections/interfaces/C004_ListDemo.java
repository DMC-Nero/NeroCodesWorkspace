package org.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

/*

	 1. List is an ordered collection it maintains the insertion order, which means upon
		displaying the list content it will display the elements in the same order in 
		which they got inserted into the list
	 2. java List provides control over the position where you can insert an element.
	 3. you can access elements by their index and also search elements in the list.
	 4. List allows you to add duplicate elements.
	 5. List allows you to have 'null' elements
	 6. List indexes start from 0, just like arrays.
	 7. Some of the most used List implementation classes are ArrayList, LinkedList, Vector, Stack , CopyOnWriteArrayList.
	
 */

public class C004_ListDemo {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
	// 4. List allows you to add duplicate elements.
		list1.add("Nero");
		list1.add("Nero");
		list1.add("Hero");
		list1.add("Hero");
	
		for(String x : list1) {
			System.out.print(x + " ");		// printing elements using enhanced for loop
		}
		System.out.println();
		System.out.println("====================");
		
	// 5. List allows you to have 'null' elements	
		list1.add(null);		
		list1.add(null);
		System.out.println(list1); 		// printing list [ toString is Overridden in ArrayList class ]
		System.out.println("====================================");
		
	// 1. List is an ordered collection it maintains the insertion order,
	// 6. List indexes start from 0, just like arrays.
		List<String> list2 = new ArrayList<>();		// index
		list2.add("element1");						// 0
		list2.add("element3");						// 1
		list2.add("element2");						// 2
		list2.add("element5");						// 3
		list2.add("element4");						// 4
		System.out.println(list2);
		System.out.println("==================================================");
		
	// 3. you can access elements by their index and also search elements in the list.
		System.out.println(list2.get(0));
		System.out.println(list2.get(3));
	}

}


















