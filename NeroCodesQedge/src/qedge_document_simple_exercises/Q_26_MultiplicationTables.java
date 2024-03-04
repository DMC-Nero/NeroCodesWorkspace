package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_26_MultiplicationTables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table you want to print");
		int a = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			int res = i * a;
			System.out.println(a + "*" + i + "=" + res);
		}

		sc.close();
	}

}
