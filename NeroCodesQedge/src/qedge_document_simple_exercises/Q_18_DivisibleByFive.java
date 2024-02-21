package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_18_DivisibleByFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int x=sc.nextInt();
		
		if(x%5==0) {
			System.out.println(x+" is divisible by 5");
		}else {
			System.out.println(x+" is not divisible by 5");
		}
		
		sc.close();
	}

}
