package qedge_document_exercises;

import java.util.Scanner;

public class Int_to_Binary_Conversion {
	public static void main(String[] args) {
		System.out.println("enter the interger number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = "";
		while (a > 0) {
			int n = a % 2;
			b = n + b;
			a = a / 2;
		}
		System.out.println("The binary number of the interger is: " + b);
		sc.close();
	}

}
