package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q11_Arithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();

		int c = a + b;
		System.out.println("the addition of two number is " + c);
		sc.close();
	}

}
