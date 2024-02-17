package qedge_class_examples;

import java.util.Scanner;

public class Reverse_of_the_number {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
				int num=sc.nextInt();
				String lol="";
				while(num>0) {
					int res=num%10;
					lol =lol+res;
					num=num/10;
				}
				System.out.println(lol);
				
			sc.close();
		}

	}


