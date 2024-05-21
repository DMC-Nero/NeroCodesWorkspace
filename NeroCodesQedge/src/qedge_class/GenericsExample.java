package qedge_class;

import java.util.ArrayList;

public class GenericsExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// before generic, less type safety
		// [ obj,obj,obj,obj,obj,obj,obj,obj,obj,obj]
		
		list.add(10);		// Allows any type object
		list.add(2.5f);		// Allows any type object
		list.add("java");	// Allows any type object
		
		
		String[] sarr = new String[5];
		// [ String,String,String,String,String,]
		sarr[0] = "java";
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		// After generics, we got more type safety
		// [Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer,Integer]
		
		list2.add(10);
// CE	list2.add(2.5f);
// CE	list2.add("java");	
	}

}
