package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_20_SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int i = sc.nextInt();
		int res = 0;
		while (i > 0) {
			int rem = i % 10;
			res = rem + res;
			i /= 10;

		}
		System.out.println("sum of digits is " + res);
		sc.close();
	}

}
