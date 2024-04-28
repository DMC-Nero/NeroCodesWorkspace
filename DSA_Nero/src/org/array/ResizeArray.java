package org.array;

public class ResizeArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		printArray(arr);
		System.out.println(arr.length);
		System.out.println();
		arr = resize(arr);
		printArray(arr);
		System.out.println(arr.length);

	}

	public static void printArray(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
			
		}
		System.out.println();
	}

	public static int[] resize(int[] arr) {
		int len = arr.length*2;
		int[] res = new int[len];
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i];
		}

		return res;
	}
}