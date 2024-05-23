package org.java.LinkedList;

import java.util.LinkedList;

/*
 	->	Java LinkedList implements List & Dequeue interfaces.
 	->	Java LinkedList class can contain duplicate elements.
 	->	Java LinkedList class maintains insertion order.
 	-> 	The LinkedList class implements Queue and Dequeue interfaces. 
 		Therefore, It can also be used as a Queue, Dequeue or Stack.
 	->	Java LinkedList is not thread-safe. You must explicitly synchronize 
 		concurrent modifications to the LinkedList in a multi-threaded environment.
 		
 		// add()
 		// add(2, element)
 		// addFirst()
 		// addLast()
 		
 */
public class C011_LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
	// Adding elements to LinkedList
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		
		System.out.println("initial linkedlist -> "+fruits);
		
	// Adding an element at the specified position in the LinkedList
		fruits.add(2,"Orange");
		System.out.println("after adding Orange -> "+fruits);
		
	// Adding an element at the beginning of the LinkedList	
		fruits.addFirst("Melon");
		System.out.println("after adding Melon -> "+ fruits);
		
	// Adding an element at the end of the LinkedList
		fruits.addLast("Berrys");
		System.out.println("after adding Berrys -> "+fruits);
		
	}
}



