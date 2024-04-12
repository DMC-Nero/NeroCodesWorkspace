package qedge.document.javaProgramming.examples;

import java.util.Scanner;

public class Q_35_decToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		String res = "";
		while(a>0) {
			int rem = a%2;
			res = rem + res ;
			a = a/2;
		}
		System.out.println(res);
	}

}

/*	a = 25 
 * 
 * 		32	16	8	4	2	1
 * 		0	1	1	0	0	1			
 *
 */
