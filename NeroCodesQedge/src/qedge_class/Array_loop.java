package qedge_class;

//Array is a data structure that manage similar data items
public class Array_loop {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 }; // Array Literal syntax

		// iterating /looping over items of the array
		// using traditional for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("===================");
		// using enhanced for loop
		for (int x : arr) {
			System.out.println(x);
		}
	}

}
