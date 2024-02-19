package qedge_class_examples;

import java.util.Scanner;

public class Array_NoOfOccurance {

	public static void main(String[] args) {
		int[] arr = new int[] { 11, 76, 56, 89, 23, 5, 56, 1, 56 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose occurence to be found ");
		int input = sc.nextInt();

		int occurance = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input) {
				occurance++;
			}
		}
		System.out.println("No of occurance of " + input + " in the array is " + occurance);

		sc.close();
	}

}
