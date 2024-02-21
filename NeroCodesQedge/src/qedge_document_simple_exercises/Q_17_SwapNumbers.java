package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_17_SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x=sc.nextInt();
		System.out.println("Enter the value of y: ");
		int y=sc.nextInt();
		System.out.println("value of x before swap: "+x +"\nvalue of y before swap: "+ y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("value of x after swap: "+x +"\nvalue of y after swap: "+ y);
		
		sc.close();
	}

}
