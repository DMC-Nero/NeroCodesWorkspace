package qedge_class_examples;

import java.util.Scanner;

public class Palindrome_number_within_range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lower range");
		int a = sc.nextInt();
		System.out.println("enter the higher range");
		int b = sc.nextInt();
		int x = a;
		while (x <= b) {
			int temp = x;
			int lol = x;
			int rev = 0;
			while (temp > 0) {
				int rem = temp % 10;
				rev = rev * 10 + rem;
				temp = temp / 10;
			}
			if (lol == rev) {
				System.out.println(lol + " is a palindrome");
			} else {
				System.out.println(lol + " is not a palindrome");
			}
			x++;
		}
		sc.close();
	}

}
