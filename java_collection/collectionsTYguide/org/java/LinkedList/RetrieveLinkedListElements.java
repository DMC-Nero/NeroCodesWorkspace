package org.java.LinkedList;

import java.util.LinkedList;

/*
 		// How to get the first element in the LinkedList.
 		// How to get the last element in the LinkedList.
 		// How to get the element at a given index in the LinkedList.
 		// How to get all the elements from LinkedList.
 		
 */
public class RetrieveLinkedListElements {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
	// Adding elements to LinkedList
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
	
	// Getting the first element in the LinkedList using getFirst()
		String first = fruits.getFirst();
		System.out.println(" first element -> "+ first);
	
	// Getting the last element in the LinkedList using getLast()
		String last = fruits.getLast();
		System.out.println(" last element -> "+ last);
		
	// Getting the element at a particular index
		String element = fruits.get(2);
		System.out.println(" element at index 2 -> "+element);
		
	// Getting elements of LinkedList
		for(String fruit : fruits)
			System.out.println(fruit);
	}

}
