package qedge_class;

import java.util.Scanner;

public class Logical_operator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value 1");
		int value1 = sc.nextInt();

		System.out.println("enter value2 ");
		int value2 = sc.nextInt();

		boolean res = value1 > 10 && value2 == 10;
		System.out.println(value1 + " > 10 && " + value2 + " == 10 " + res);
		sc.close();
	}

}
