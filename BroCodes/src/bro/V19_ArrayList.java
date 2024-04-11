package bro;

import java.util.ArrayList;

public class V19_ArrayList {

	public static void main(String[] args) {
		// ArrayList = a resizable array.
		//				Elements can be added and removed after compilation phase
		//				store reference data types
		// syntax :- 		ArrayList<ref_DT>  name = new Arraylist<ref_DT>();
		//					for primitive data type we use there wrapper class
		// food.add(); 				is to add objects to array list.
		// food.size();				is to get the length of the array list
		// food.get(index);			is to retrieve the data from array list
		// food.set(0,"sushi");		is used to override the data 
		// food.remove(2);			is used to remove or delete data from array list
		// food.clear();			is used to clear the array list
		
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("rice");
		food.add("pizza");
		food.add("hotdog");
		
		for(int i = 0;i<food.size();i++) {
			System.out.println(food.get(i));
		}
		
		food.set(0, "sushi");
		food.remove(2);
		System.out.println(food);
		food.clear();
		System.out.println(food);
	}

}
