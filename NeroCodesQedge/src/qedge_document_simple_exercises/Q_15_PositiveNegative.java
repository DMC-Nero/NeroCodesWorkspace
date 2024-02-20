package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_15_PositiveNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("its a positive number");
		}else if(a<0) {
			System.out.println("its a negative number");
		}else {
			System.out.println("its a nutral number");
		}
		
		sc.close();
	}

}
