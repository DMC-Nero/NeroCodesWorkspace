package qedge_class_examples;

import java.util.Scanner;

public class Name_age {
	public static void main(String[] args ){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("enter your age");
		byte age=sc.nextByte();
		
		System.out.println("Hi " + name + ", you are "+ age + " years old!!!!!");
		
		
		sc.close();
	}

}
