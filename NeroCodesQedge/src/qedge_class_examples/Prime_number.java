package qedge_class_examples;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lower bound");
		int a = sc.nextInt();
		System.out.println("enter higher bound");
		int b = sc.nextInt();
		int x = a;
		while (x <= b) {
			int y = 2;
			int factor = 0;
			while (y < x) {
				int rem = x % y;
				if (rem == 0) {
					factor++;
				}
				y++;
			}
			if (factor == 0) {
				System.out.println(x + " is prime");
			} else {
				System.out.println(x + " is not prime");
			}

			x++;
		}

		sc.close();
	}

}
