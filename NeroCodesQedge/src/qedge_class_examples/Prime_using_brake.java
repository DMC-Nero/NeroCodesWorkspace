package qedge_class_examples;

import java.util.Scanner;

public class Prime_using_brake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for prime check");

		int num = sc.nextInt();
		int factor = 2;
		for (int i = 2; i < num; i++) {
			System.out.println("Iteration #" + (i - 1));
			int rem = num % i;
			if (rem == 0) {
				factor++;
				break;
			}
		}
		if (factor == 2) {
			System.out.println("its a prime number");
		} else {
			System.out.println("its not a prime number");
		}

		sc.close();
	}

}
