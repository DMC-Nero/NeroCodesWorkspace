package qedge_class_examples;
import java.util.*;
public class Leap_year {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		boolean leap1=year%4==0;
		boolean leap2=(year%100!=0)||(year%400==0);
		if(leap1 && leap2) {
			System.out.println(year+" is a leap year");
		}else {
			System.out.println(year+" not a leap year");
		}
		
		sc.close();
	}


}
