package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_27_GradeMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the grade");
		char lol = sc.next().charAt(0);
		char grad = Character.toLowerCase(lol);
		switch (grad) {
		case 'a':
			System.out.println("pass:-" + " marks are between 85-100");
			break;
		case 'b':
			System.out.println("pass:-" + " marks are between 75-84");
			break;
		case 'c':
			System.out.println("pass:-" + " marks are between 55-74");
			break;
		case 'd':
			System.out.println("pass:-" + " marks are between 40-54");
			break;
		case 'f':
			System.out.println("Fail  !!!");
			break;
		default:
			System.out.println("no such grade found !!!");
		}
		sc.close();

	}
}