package qedge_class;

import java.util.Scanner;

public class If_else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your blood pressure");
		int bp = sc.nextInt();

		if (bp > 120) {
			System.out.println("HBP");
		} else {
			System.out.println("LBP");
		}

		System.out.println("========================");
		System.out.println("enter subject 1 marks");
		int sub1 = sc.nextInt();

		System.out.println("enter subject 2 marks");
		int sub2 = sc.nextInt();

		System.out.println("enter subject 3 marks");
		int sub3 = sc.nextInt();

		if (sub1 > 35 && sub2 > 35 && sub3 > 35) {
			System.out.println("you are passed");
		} else {
			System.out.println("you are failed");
		}

		sc.close();
	}

}
