package qedge_class;

import java.util.Scanner;

public class Nested_if_else_if {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter sub1 marks");
		int sub1=sc.nextInt();
		
		System.out.println("enter sub2 marks");
		int sub2=sc.nextInt();
		
		System.out.println("enter sub3 marks");
		int sub3=sc.nextInt();
		
		int total =sub1+sub2+sub3;
		double avg=total/3;
		
		if (sub1>35 && sub2>35 && sub3>35) {
			System.out.println("you are passed");
			System.out.println("your total marks: "+ total + " , Average marks: "+ avg);
			if(avg>75){
				System.out.println("first Division");
			}else if(avg>55) {
				System.out.println("Second Division");
			}else if(avg>35) {
				System.out.println("Third Division");
			}
		}else {
			System.out.println("you are failed");
			
		}
		sc.close();

	}

}
