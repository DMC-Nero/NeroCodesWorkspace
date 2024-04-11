package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_31_IncreByOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer");
		int a = sc.nextInt();
		int res = 0;
		while(a > 0) {
			int rem = a%10;
			int rem2 = rem+1;
			res = rem2 + res*10  ;
			a = a/10;
		}
		a = res;
		res = 0;
		while(a>0) {
			int rem = a%10;
			res = res*10 + rem;
			a = a/10;
		}
		System.out.println(res);
	}

}
