package qedge_class;

import java.util.Scanner;

public class Relational_operators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a double value");
		double d1 = sc.nextDouble();
		System.out.println("Enter a double value");
		double d2 = sc.nextDouble();

		boolean res = d1 > d2;
		System.out.println(d1 + ">" + d2 + "=>" + res);
		res = d1 >= d2;
		System.out.println(d1 + ">=" + d2 + "=>" + res);
		res = d1 < d2;
		System.out.println(d1 + "<" + d2 + "=>" + res);
		res = d1 <= d2;
		System.out.println(d1 + "<=" + d2 + "=>" + res);

		sc.close();
	}

}
