package qedge_class_examples;
import java.util.Scanner;
public class Area_of_circle {
	public static void main(String[] args) {
		System.out.println("enter the radius of the circle");
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		
		double peremeter=2*3.14*r;
		double area=3.14*r*r;
		System.out.println("peremeter of the circle "+ peremeter);
		System.out.println("area of the circle " + area);
		
		sc.close();
	}
}
