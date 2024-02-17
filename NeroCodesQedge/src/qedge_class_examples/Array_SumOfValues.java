package qedge_class_examples;

import java.util.Scanner;

public class Array_SumOfValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int i = 1;
		while (i <= arr.length) {
			System.out.println("enter the " + i + " number");

			arr[i - 1] = sc.nextInt();
			i++;

		}
		int x = 0;
		int sum = 0;
		while (x < arr.length) {
			sum = sum + arr[x];
			x++;
		}
		System.out.println("======================");
		System.out.println("Sum of the array is " + sum);
		sc.close();
	}

}
