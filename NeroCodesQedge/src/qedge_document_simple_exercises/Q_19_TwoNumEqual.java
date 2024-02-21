package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_19_TwoNumEqual {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number ");
		int x=sc.nextInt();
		System.out.println("Enter the second number ");
		int y=sc.nextInt();
		if(x==y) {
			System.out.println(x+" is equal to "+ y);
		}else {
			System.out.println(x+" is not equal to "+y);
		}
		
		
		sc.close();
	}

}
