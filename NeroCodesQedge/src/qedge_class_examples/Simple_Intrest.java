package qedge_class_examples;

import java.util.Scanner;

public class Simple_Intrest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principal amount ");
		double p_amount = sc.nextDouble();
		System.out.println("enter the time duration in months");
		double time = sc.nextDouble();
		System.out.println("enter the rate of intrest ");
		double r_intrest = sc.nextDouble();

		double intrest = (p_amount * time * r_intrest) / 100;
		System.out.println("the simple intrest of the amount is " + intrest + " rupees");
		System.out.println("the total you have to pay " + (intrest + p_amount) + " rupees");

		sc.close();
	}

}
