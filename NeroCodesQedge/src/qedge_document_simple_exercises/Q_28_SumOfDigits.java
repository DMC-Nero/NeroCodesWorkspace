package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_28_SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int res = 0;
		while (a > 0) {
			int b = a % 10;
			res = res + b;
			a = a / 10;
		}
		System.out.println("The sum of the given number is "+res);
		
		
		sc.close();
	}

}
