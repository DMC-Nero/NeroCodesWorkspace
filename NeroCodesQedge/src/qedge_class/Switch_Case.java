package qedge_class;

import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int x=sc.nextInt();
		//double x=sc.nextDouble();
		//long x=sc.nextLong();
		
		switch(x) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
		default :
			System.out.println("no match");
		
		
		}
		
		sc.close();
		}

}
