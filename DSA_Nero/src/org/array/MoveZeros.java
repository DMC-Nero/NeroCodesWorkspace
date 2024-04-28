package org.array;

public class MoveZeros {

	public static void main(String[] args) {
		int[] myArray = { 8, 1, 0, 2, 1, 0, 3 };
		printArray(myArray);
		System.out.println();
		moveArray(myArray);
		System.out.println();
		printArray(myArray);
	}

	public static void moveArray(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

			if (arr[j] != 0) {
				j++;
			}

		}

	}

	public static void printArray(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

}
