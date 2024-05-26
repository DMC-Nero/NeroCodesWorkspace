package org.java.LinkedList;

/*
	1. How to remove the first element in the LinkedList.
	2. How to remove the last element in the LinkedList.
	3. How to removing element by passing object 
	4. How to remove the first occurrence of a given element in the LinkedList.
	5. How to clear the LinkedList completely.
		
 */

import java.util.LinkedList;

public class C013_RemoveElementsFromLinkedList {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("pineapple");
		fruits.add("Grapes");
		
		System.out.println("Initial LinkedList \t      --> "+ fruits);
		
		// Removing first element from LinkedListt
		fruits.removeFirst();
		System.out.println("after removing first element  --> "+ fruits);
		
		// Removing last element from LinkedList
		fruits.removeLast();
		System.out.println("after removing last element   --> "+ fruits);
		
		// Removing element by passing object 
		fruits.remove("Banana");
		System.out.println("after removing Banana \t      --> "+ fruits);
		
		// Remove the first occurrence of a given element in the LinkedList.
		fruits.removeFirstOccurrence("pineapple"); 
		System.out.println("after removing first occurene --> "+fruits);
		
		// clear the LinkedList completely.
		fruits.clear();
		System.out.println("after clearing \t\t      --> " + fruits);
	}

}
