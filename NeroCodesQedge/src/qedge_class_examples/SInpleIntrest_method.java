package qedge_class_examples;

import java.util.Scanner;

public class SInpleIntrest_method {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principe amount");
		double p=sc.nextDouble();
		System.out.println("Enter Time");
		double t=sc.nextDouble();
		System.out.println("Enter rate of Interest");
		double r=sc.nextDouble();
		
		double res=SInpleIntrest_method.simInt(p, t, r);
		System.out.println("the intrest is "+res);
		
		sc.close();
		
	}
	public static double simInt(double p,double t,double r) {
		double res = (p*t*r)/100;
		return res;
		
	}

}
