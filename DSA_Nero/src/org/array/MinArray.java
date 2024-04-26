package org.array;

public class MinArray {

	public static int minArray(int[] arr) {
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 9, 3, 15, 1, 2 };
		int result = minArray(arr);
		System.out.println(result);
	}

}
