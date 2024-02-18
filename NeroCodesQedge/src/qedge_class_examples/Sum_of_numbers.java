package qedge_class_examples;

import java.util.Scanner;

public class Sum_of_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int num = Math.abs(sc.nextInt());
		System.out.println("Provided absolute value " + num);

		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("The addition of the number " + sum);

		sc.close();
	}

}