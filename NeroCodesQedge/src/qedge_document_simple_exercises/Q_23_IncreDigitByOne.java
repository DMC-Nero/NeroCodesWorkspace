package qedge_document_simple_exercises;

import java.util.Scanner;

public class Q_23_IncreDigitByOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x=sc.nextInt();		
		int res=0;
		int res2=0;
		while(x>0) {
			int y=x%10;
			y+=1;
			res=res*10+y;
			x=x/10;
		}
		
		while(res>0) {
			int z=res%10;
			res2=res2*10+z;
			res=res/10;
		}
		System.out.println(res2);
		
		sc.close();
	}

}
