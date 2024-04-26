package org.array;

public class RemoveEvenInteger {

	public static void printArray(int[] arr) {

		for (int x : arr) {
			System.out.print(x + " ");
		}

	}

	public static int[] removeEven(int[] arr) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			}
		}

		int[] oddArray = new int[count];
		int idx = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				oddArray[idx] = arr[i];
				idx++;
			}
		}

		return oddArray;
	}

	public static void DemoArray() {
		int[] myArray = { 3, 2, 4, 7, 10, 6, 5 };
		int[] lol = removeEven(myArray);
		printArray(lol);
	}

	public static void main(String[] args) {
		DemoArray();
	}

}
