package org.array;

public class ReverseArray {
	public static int[] reverseArray(int[] arr, int start, int end) {
		while (start < end) {

			int temp;
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 11, 5, 10, 7, 8 };
		int len = arr.length - 1;
		printArray(arr);
		System.out.println();
		reverseArray(arr, 0, len);
		printArray(arr);

	}

}
