package qedge_class_examples;

import java.util.Scanner;

public class Area_of_rectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		int a = sc.nextInt();
		System.out.println("Enter the Width");
		int b = sc.nextInt();
		int c = a * b;
		System.out.println("the area of rectangle => " + c + " sq meters");

		sc.close();
	}
}
