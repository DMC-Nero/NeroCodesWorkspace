package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_14_SumOf_EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int i = 0;

		while (i < 10) {
			System.out.println("enter the number ");
			arr[i] = sc.nextInt();
			i++;
		}
		int j = 0;
		while (j < 10) {
			System.out.println(arr[j]);
			j++;
		}
		System.out.println("==========");

		int k = 0;
		int rem1 = 0;
		int rem2 = 0;
		while (k < 10) {
			if (arr[k] % 2 == 0) {
				rem1 = rem1 + arr[k];
			} else {
				rem2 = rem2 + arr[k];
			}
			k++;
		}
		System.out.println("sum of even " + rem1);
		System.out.println("sum of odd " + rem2);

		sc.close();

	}

}
