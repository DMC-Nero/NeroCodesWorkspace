package qedge_class_examples;

import java.util.Scanner;

public class Multiplication_tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lower bound value");
		int lowerBound = sc.nextInt();
		System.out.println("enter upper bound value");
		int upperBound = sc.nextInt();

		int x = lowerBound;
		while (x <= upperBound) {
			int y = 1;
			while (y <= 10) {
				System.out.println(x + "*" + y + "=" + (x * y));
				y++;
			}
			System.out.println("===============");
			x++;

		}

		sc.close();

	}

}
