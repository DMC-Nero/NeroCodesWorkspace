package qedge_class_examples;
import java.util.Scanner;
public class Divisible_by_five {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int numb=sc.nextInt();
		if (numb%5==0) {
			System.out.println("number is divisible by 5");
		}else {
			System.out.println("number is not divisible by 5");
		}
		sc.close();
	}
}
