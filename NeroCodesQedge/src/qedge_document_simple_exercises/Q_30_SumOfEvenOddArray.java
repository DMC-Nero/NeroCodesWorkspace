package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_30_SumOfEvenOddArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element you want in array");
		int n = sc.nextInt();
		int[] a = new int[n];
		int even=0;
		int odd=0;
		System.out.println("enter the elements of array");
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			
		}
		
		for(int j=0;j<n;j++) {
			if(a[j]%2==0) {
				even = even +a[j];
			}else {
				odd = odd+a[j];
			}
		}
		System.out.println("sum of even numbers in the array "+even);
		System.out.println("sum fo odd numbers in the array "+odd);
		
		sc.close();
	}

}
