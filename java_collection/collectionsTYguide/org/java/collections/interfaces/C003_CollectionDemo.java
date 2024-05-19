package org.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class C003_CollectionDemo {
	public static void main(String[] args) {
	
	// Collection(I) <-- List(I) <-- ArrayList(C)
		Collection<String> fruitCollection = new ArrayList<>();		
		
	// adding elements to the collection fruit by using [ add() ] method.
		fruitCollection.add("Banana");
		fruitCollection.add("Mango");
		fruitCollection.add("Apple");
		System.out.println(fruitCollection);	// printing fruit after adding all elements --> toString() is overridden 
		
	// remove element form the collection fruit by using [ remove() ] method
		fruitCollection.remove("Mango");
		System.out.println(fruitCollection);	// printing fruit after removing an element --> toStirng() is overridden
		
	// checking if given element is present in fruitCollection by using [ contains() ] method
			// return boolean value if the given element contain in collection
		System.out.println(fruitCollection.contains("Banana"));	
		
	// we can use for-each loop to iterate over collection using lambda expression
		fruitCollection.forEach((element) -> {
			System.out.print(element + " ");
		});
		
		
	}
}
