package qedge_class_examples;

import java.util.Scanner;

public class Perfect_number {

	// 6 is a perfect number because 1 + 2 + 3 = 6.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int i = sc.nextInt();
		int a = 1;
		int rem = 0;
		while (a < i) {
			if (i % a == 0) {
				System.out.println(a + " is a factor");
				rem = rem + a;

			}
			a++;
		}
		System.out.println("sum of the factors: " + rem);
		if (rem == i) {
			System.out.println("its a perfect number");
		} else {
			System.out.println("its not a perfect number");
		}
		sc.close();
	}

}
