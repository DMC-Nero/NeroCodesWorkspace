package qedge_class_examples;

import java.util.*;

public class Employee_data {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee name ");
		String name = sc.nextLine();
		System.out.println("enter designation of the employee ");
		String desig = sc.nextLine();
		System.out.println("enter the anual Salary");
		int salary = sc.nextInt();

		System.out.println("name\t\t" + "designation\t\t" + "salary");
		System.out.println(name + "\t\t" + desig + "\t\t\t" + salary);

		sc.close();
	}

}
