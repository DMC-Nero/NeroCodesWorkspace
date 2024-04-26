package org.array;

public class ArrayUtil {

	public void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void arrayDemo() {
		int[] myArray = new int[5];
		myArray[0] = 12;
		myArray[1] = 2;
		myArray[2] = 14;
		myArray[3] = 4;
		myArray[4] = 6;
//		 	myArray[5] = 12;	arrayIndexOutOfBoundException
		myArray[3] = 7;
		printArray(myArray);

		int[] arr = { 1, 2, 3, 4 };
		printArray(arr);
		System.out.println(myArray.length);
		

	}

	public static void main(String[] args) {
		ArrayUtil arr = new ArrayUtil();
		arr.arrayDemo();
	}

}
