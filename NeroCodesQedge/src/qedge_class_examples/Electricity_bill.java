package qedge_class_examples;

import java.util.*;

public class Electricity_bill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the units of consumed electricity ");
		double consum = sc.nextDouble();
		double total = consum * 8.5;

		System.out.println("your total electric bill is " + total);

		sc.close();
	}

}
