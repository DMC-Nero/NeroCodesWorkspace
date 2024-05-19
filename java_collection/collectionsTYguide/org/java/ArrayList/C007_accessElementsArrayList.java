package org.java.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
 	 1.	How to check if an ArrayList is empty using the isEmpty() method.
 	 2. How to find the size of an ArrayList using the size() method.
 	 3. How to access the element at a particular index in an ArrayList using the get() method.
 	 4. How to modify the element at a particular index in an ArrayList using the set() method.
 	 
 */
public class C007_accessElementsArrayList {

	public static void main(String[] args) {
		List<String> myArrayList = new ArrayList<>();
//	1. How to check if an ArrayList is empty using the isEmpty() method.
		System.out.println(myArrayList.isEmpty());
		System.out.println("=====");
										// index
		myArrayList.add("C");			// 0
		myArrayList.add("Java");		// 1
		myArrayList.add("C++");			// 2
		myArrayList.add("Python");		// 3
		myArrayList.add(".net");		// 4
		
//	2. How to find the size of an ArrayList using the size() method.
		System.out.println(myArrayList.size());
		System.out.println("=====");
		
//	3. How to access the element at a particular index in an ArrayList using the get() method.
		System.out.println(myArrayList.get(3));
		
//	4. How to modify the element at a particular index in an ArrayList using the set() method.
		System.out.println("before setting :- "+myArrayList);
		myArrayList.set(2, "JavaScript");
		System.out.println("after setting :- "+myArrayList);
	}

}







