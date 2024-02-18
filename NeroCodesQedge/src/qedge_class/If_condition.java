package qedge_class;

import java.util.Scanner;

public class If_condition {
	public static void main(String[] args) {
		System.out.println("main start");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		if (age > 18) {
			System.out.println("you can vote");
			System.out.println("you can spend time with your friends");
			System.out.println("chance are election will be held on march of 2024");

		}
		int mAge = 75;
		if (age > mAge)
			System.out.println("you are elder than PM");
		System.out.println("He is going to take advice from you");

		System.out.println("main end");

		sc.close();
	}

}
