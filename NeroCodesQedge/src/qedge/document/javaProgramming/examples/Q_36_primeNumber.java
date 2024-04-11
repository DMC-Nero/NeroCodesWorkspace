package qedge.document.javaProgramming.examples;

import java.util.Scanner;

public class Q_36_primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int count = 0;
		while(count == 0) {
			for(int i=2;i<a;i++) {
				if(a%i == 0) {
					count=count+1;
					break;
				}
			}
			if(count==0) {
				break;
			}
		}
		if(count == 0) {
			System.out.println("its a prime number");
		}else {
			System.out.println("its not a prime number");
		}
		sc.close();
	}

}
