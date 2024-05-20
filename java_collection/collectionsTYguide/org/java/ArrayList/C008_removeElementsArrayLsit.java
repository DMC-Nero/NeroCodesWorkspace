package org.java.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
	1.	How to remove an element from an ArrayList by using the remove() method.
	2.	How to remove  elements from an ArrayList by using the removeAll() method.
	3.	How to clear elements from an ArrayList by using the clear() method.
 */
public class C008_removeElementsArrayLsit {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();	// index
		fruits.add("Banana");						// 0
		fruits.add("Apple");						// 1
		fruits.add("Mango");						// 2
		fruits.add("Orange");						// 3
		fruits.add("Pineapple");					// 4
		fruits.add("Grapes");						// 5
		
//	1. removing element my using remove(index) method by passing argument as index.
		System.out.println(" -> remove{index)");
		System.out.println("==================");
		System.out.println("Before removing :- \t" + fruits);
		fruits.remove(2);
		System.out.println("After removing:- \t"+ fruits);
		System.out.println();
//	1. removing element my using remove(object) method by passing argument as object.
		System.out.println(" -> remove(object)");
		System.out.println("==================");
		System.out.println("Before removing :- \t"+ fruits);
		fruits.remove("Banana");
		System.out.println("After removing :- \t"+ fruits);
		System.out.println();
//	2. How to remove all elements from an ArrayList by using the removeAll() method.
		// creating new ArrayList of fruits that i want to remove from main ArrayList
		List<String> fruitsRemove = new ArrayList<String>();
		System.out.println(" -> removeAll()");
		System.out.println("==================");
		fruitsRemove.add("Orange");
		fruitsRemove.add("Grapes");
		fruitsRemove.add("FruitNotInMainList");
		System.out.println("Before removing :- \t"+ fruits);
		fruits.removeAll(fruitsRemove);
		System.out.println("After removing :- \t"+ fruits);
		System.out.println();
//	3.	How to clear elements from an ArrayList by using the clear() method.
		System.out.println(" -> clear()");
		System.out.println("==================");
		System.out.println("Before clearing :- \t"+fruits);
		fruits.clear();
		System.out.println("After clearing :- \t"+fruits);
	}

}












