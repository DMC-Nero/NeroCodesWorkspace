package org.java.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C006_ArrayListFromCollection {

	public static void main(String[] args) {
	// creating ArrayList and adding first 5 prime numbers
		List<Integer> first5Prime = new ArrayList<>();
		first5Prime.add(2);
		first5Prime.add(3);
		first5Prime.add(4);
		first5Prime.add(7);
		first5Prime.add(11);
	
	// creating new ArrayList and passing the first5Prime as an argument. 
		List<Integer> PrimeNo = new ArrayList<>(first5Prime);
		System.out.println(PrimeNo);		// printing PrimeNo
	
	// creating new ArrayList and adding next 5 prime numbers.
		List<Integer> next5Prime = new ArrayList<>();
		next5Prime.add(13);
		next5Prime.add(17);
		next5Prime.add(19);
		next5Prime.add(23);
		next5Prime.add(29);
		
	// merging next5Prime to PrimeNo by using "addAll(C)" method by passing next5Prime collection as argument  
		PrimeNo.addAll(next5Prime);		
		System.out.println(PrimeNo);
		
		
	}

}















