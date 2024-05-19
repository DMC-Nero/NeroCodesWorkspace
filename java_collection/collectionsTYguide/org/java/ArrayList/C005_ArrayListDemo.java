package org.java.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
	 1. An ArrayList is re-sizable array, also called a dynamic array. It grows its size to 
		accommodate new elements and shrinks the size when the elements are removed.
	 2. ArrayList internally uses an array to store the elements. Just like arrays, it allows 
	 	you to retrieve the elements by their index.
	 3. Java ArrayList allows duplicate and null values.
	 4. Java ArrayList is an ordered collection. It maintains the insertion order of the 
	 	elements.
	 5. You cannot create an ArrayList of primitive types like int, char etc. You need to
	 	use boxed types like Integer, Character, Boolean etc.
	 6. Java ArrayList is not synchronized. If multiple threads try to modify an ArrayList at
	 	the same time, then the final outcome will be non-deterministic. You must explicitly 
	 	synchronize access to an ArrayList if multiple threads are gonna modify it.
	 	
  				--> Note:-	 Default capacity of an ArrayList is [10]. <--
 */

public class C005_ArrayListDemo {

	public static void main(String[] args) {
	// creating an ArrayList object
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		System.out.println(fruits);
		 
	}

}













