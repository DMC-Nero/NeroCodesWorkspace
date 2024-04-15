package qedge.document.javaProgramming.examples;

import java.util.Scanner;

public class Q_37_primeNumber_GivenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lower bond ");
		int low = sc.nextInt();
		System.out.println("enter the higher bond ");
		int high = sc.nextInt();
		for(int i=low;i<=high;i++) {
			
			
			
			int a = i;
			int count = 0;
			while(count == 0) {
				for(int j=2;j<a;j++) {
					if(a%j == 0) {
						count=count+1;
						break;
					}
				}
				if(count==0) {
					break;
				}
			}
			if(count == 0) {
				System.out.println(i+" its a prime number");
			}
			else {
				System.out.println(i+" its not a prime number");
			}
			
			
			
		}
		sc.close();
	}

}
