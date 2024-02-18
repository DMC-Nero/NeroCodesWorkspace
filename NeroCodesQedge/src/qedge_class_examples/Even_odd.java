package qedge_class_examples;

import java.util.Scanner;

public class Even_odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int numb = sc.nextInt();
		if (numb % 2 == 0) {
			System.out.println("its an even number");
		} else {
			System.out.println("its an odd number");
		}

		sc.close();
	}

}
