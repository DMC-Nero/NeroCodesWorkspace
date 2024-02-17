package qedge_class_examples;
import java.util.Scanner;
public class Armstrong_number {
	//153, it's an Armstrong number because 1^3 + 5^3 + 3^3 equals 153.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		Long a=sc.nextLong();
		Long c=a;
		Long res=a;
		int t=0;
		Long rem;
		double total=0;
		while(a>0) {
			a=a/10;
			
			t++;
		}
		double lol=t;
		while(c>0) {
			rem=c%10;
			//total =rem*lol+total;	
			total=total+Math.pow(rem, lol);
			c=c/10;
			
		}
		
		//System.out.println(total);
		if(res==total) {
			System.out.println((Long)res+" is a ArmStrong Number");
		}else {
			System.out.println((Long)res+" is not a ArmString");
		}
		
				
		sc.close();
	}

}
