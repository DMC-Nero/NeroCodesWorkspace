package org.java.collections;

public class C001_NeedOfCollection {
	public static void main(String[] args) {
		int[] arr = new int[1000];
		
		// limitations of an array
		// 1. Arrays are fixed in size
		// 2. Arrays can hold only homogeneous data elements
		// 3. Ready made APIs support is not available in array
		
		Student[] student = new Student[10];
		student[0] = new Student();
		student[2] = new Student();
		// student[3] = new Book();		--> error  // array can store homogeneous only
		
		Object[] objects = new Object[10];
		objects[0] = new Object();
		objects[1] = new Student();		// --> Student is sub-type of object class
		objects[2] = new Book();		// --> Book is a sub-type of object class
		
	/*
		--> to overcome all the limitations of array we need collection framework 
		--> we can store different types of objects in collections (eg :- String, Integer ....)
		--> collections framework is implemented using standard data structures
		--> lot of ready made APIs are available, no need to write explicitly 
		--> introduced in JDK [1.2]
	*/
	}


}

class Book {
	
}

class Student {
	
}