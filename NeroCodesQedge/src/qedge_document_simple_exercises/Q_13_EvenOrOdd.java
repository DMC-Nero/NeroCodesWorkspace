package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_13_EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("its an Even number ");

		} else {
			System.out.println("its an Odd number ");
		}

		sc.close();
	}

}
