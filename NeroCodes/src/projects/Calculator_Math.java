package projects;

import java.util.*;

public class Calculator_Math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(" ");
			System.out.println("enter the first number");
			int a, b, c;
			int quit = 0;
			a = sc.nextInt();
			System.out.println("enter the second number");
			b = sc.nextInt();
			System.out.println("press 1 for addition");
			System.out.println("press 2 for multiplication");
			System.out.println("press 3 for divison");
			System.out.println("press 4 for subtracion");
			System.out.println("press 5 for module");
			System.out.println("press 6 to exit loop");

			c = sc.nextInt();
			{

				switch (c) {
				case (1):
					System.out.println("the addition of the given numbers " + (a + b));
					break;
				case (2):
					System.out.println("the multiplication of the given numbers " + (a * b));
					break;
				case (3):
					System.out.println("the division of the given numbers " + (a / b));
					break;
				case (4):
					System.out.println("the subtraction of the given numbers " + (a - b));
					break;
				case (5):
					System.out.println("the module of the given numbers " + (a % b));
					break;
				case (6):
					System.out.println("press 6 to exit cal");
					quit = 6;
					break;

				default:
					System.out.println("no such opetation found");
				}
			}
			if (quit == 6)
				break;
		}
		sc.close();
	}
}
