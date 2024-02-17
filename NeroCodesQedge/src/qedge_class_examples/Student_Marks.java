package qedge_class_examples;

import java.util.Scanner;

public class Student_Marks {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter sub 1 marks ");
		int sub1= sc.nextInt();
		System.out.println("enter sub 2 marks ");
		int sub2= sc.nextInt();
		System.out.println("enter sub 3 marks ");
		int sub3= sc.nextInt();
		
		int total=sub1+sub2+sub3;
		double avg=total/3.0;
		System.out.println("the total marks: "+ total);
		System.out.println("the avg marks: "+ avg);
		
		sc.close();
	}

}
