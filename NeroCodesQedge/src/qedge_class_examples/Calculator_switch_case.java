package qedge_class_examples;

import java.util.Scanner;

public class Calculator_switch_case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("press.... \n\t 1 for Addition, \n\t 2 for subtraction,\n\t 3 for mulitplication,\n\t 4 for division,\n\t 5 for mod ");
		
		System.out.println("Enter your Choice");
		int input =sc.nextInt();
		System.out.println("Enter first value");
		int x=sc.nextInt();
		System.out.println("Enter second value");
		int y=sc.nextInt();
		
		switch (input) {
		case 1:
			int res =x+y;
			System.out.println(x + " + " + y + " = " + res);
			break;
		case 2:
			 res =x-y;
			System.out.println(x + " - " + y + " = " + res);
			break;
		case 3:
			 res =x*y;
			System.out.println(x + " * " + y + " = " + res);
			break;
		case 4:
			 res =x/y;
			System.out.println(x + " / " + y + " = " + res);
			break;
		case 5:
			 res =x%y;
			System.out.println(x + " % " + y + " = " + res);
			break;
		default:
			System.out.println("Invalid operator");
			break;
		
		}
		sc.close();
		
	}

}
