package qedge_class_examples;

import java.util.Scanner;

public class Student_name_print_marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(i<=5) {
			System.out.println("Enter the names of students ");
			
			String name=sc.nextLine();
			
			System.out.println("enter subject 1 marks");
			int marks1=sc.nextInt();
			System.out.println("enter subject 2 marks");
			int marks2=sc.nextInt();
			System.out.println("enter subject 3 marks");
			int marks3=sc.nextInt();
			
			
			i++;
			System.out.println("name " + name);
			System.out.println("sub 1 marks "+marks1);
			System.out.println("sub 2 marks "+marks2);
			System.out.println("sub 3 marks "+marks3);
			System.out.println(" ");
			sc.nextLine();
		}
		sc.close();
	}

}
