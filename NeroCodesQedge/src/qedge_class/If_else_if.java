package qedge_class;

import java.util.Scanner;

public class If_else_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter first number");
		int x = sc.nextInt();
		System.out.println("enter second number");
		int y = sc.nextInt();
		System.out.println("enter third number");
		int z = sc.nextInt();

		if (x > y && x > z) {
			System.out.println(x + " is greater");
		} else if (y > z) {
			System.out.println(y + " is greater");
		} else {
			System.out.println(z + " is greater");
		}
		sc.close();
	}
}
