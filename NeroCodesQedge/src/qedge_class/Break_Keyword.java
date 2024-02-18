package qedge_class;

import java.util.Scanner;

public class Break_Keyword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for English, 2 for Hindi, 3 for Telugu");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("you've selected English");
			break;
		case 2:
			System.out.println("you've selected Hindi");
			break;
		case 3:
			System.out.println("you've selected Telugu");
			break;
		default:
			System.out.println("Invalid choice");
		}

		sc.close();
	}

}
