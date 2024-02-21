package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_24_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		System.out.println("choose the operator    +,-,*,/,%");
		char x=sc.next().charAt(0);
		
		switch(x) {
		case '+'	:	System.out.println(a+b);
		break ;
		case '-'	:	System.out.println(a-b);
		break ;
		case '*'	:	System.out.println(a*b);
		break ;
		case '/'	:	System.out.println(a/b);
		break ;
		case '%'	:	System.out.println(a%b);
		break ;
		default 	:	System.out.println("no such operation found");
		}
		sc.close();
	}

}
