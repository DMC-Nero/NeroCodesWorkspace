package qedge_class;

import java.util.Scanner;

public class Return {
	public static void main1(String[] args) {
		// without return value
		// version 1
		System.out.println("main start");
		System.out.println("main end");
		return;
	}

	public static void app() {
		// without return value
		// version 2
		System.out.println("main start");
		Scanner m = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = m.nextInt();
		if (num < 0) {
			m.close();
			return;
		}
		System.out.println("main end");
		m.close();
	}

	public static void lol() {
		// with return value
		// version 1
		System.out.println("main start");
	}

	public static int add() {
		System.out.println("add start");
		System.out.println("add end");
		return 10;
	}

	public static void main2(String[] args) {
		// with return value
		// version 2
		System.out.println("main start");
		add(); // method call
		System.out.println("main end");
	}

	public static int add2() {
		System.out.println("add start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x value");
		int x = sc.nextInt();

		System.out.println("Enter y value");
		int y = sc.nextInt();

		if (x > y) {
			int result = x + y;
			sc.close();
			return result;
		}
		System.out.println("add end");
		sc.close();
		return 0;
	}

}
