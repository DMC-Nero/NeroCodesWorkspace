package qedge_class_examples;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Your entered value" + temp + " & after reversing: " + rev);
		if (temp == rev) {
			System.out.println(temp + " is a palindrome");

		} else {
			System.out.println(temp + " is not a palindrome");
		}

		sc.close();
	}

}
