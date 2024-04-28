package org.array;

public class SecondMaxInArray {

	public static int secondMax(int[] arr) {
		int secondMax = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}

		return secondMax;
	}

	public static void main(String[] args) {
		int[] myArray = { 12, 34, 2, 34, 33, 1 };
		System.out.println(secondMax(myArray));
	}

}
