package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_32_ArithmeticOp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of first number ");
		int a = sc.nextInt();
		System.out.print("enter the value of second number ");
		int b = sc.nextInt();
		System.out.println("enter the operation");
		char op = sc.next().charAt(0);
		switch(op) {
		case '+': System.out.println(a+b); 	break;
		case '-': System.out.println(a-b); 	break;
		case '*': System.out.println(a*b); 	break;
		case '/': System.out.println(a/b); 	break;
		case '%': System.out.println(a%b); 	break;
		default : System.out.println("no such case found");
		}
		sc.close();
	}

}
