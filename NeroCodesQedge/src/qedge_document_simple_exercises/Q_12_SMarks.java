package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_12_SMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the subject 1 marks ");
		int a = sc.nextInt();
		System.out.println("enter the subject 2 marks ");
		int b = sc.nextInt();
		System.out.println("enter the subject 3 marks ");
		int c = sc.nextInt();
		System.out.println("enter the subject 4 marks ");
		int d = sc.nextInt();

		int total = a + b + c + d;
		int avg = total / 4;
		System.out.println("Total marks " + total);
		System.out.println("Average marks " + avg);

		sc.close();
	}

}
