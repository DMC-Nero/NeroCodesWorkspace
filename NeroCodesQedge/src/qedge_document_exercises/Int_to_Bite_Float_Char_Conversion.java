package qedge_document_exercises;

import java.util.Scanner;
public class Int_to_Bite_Float_Char_Conversion {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("enter the interger number");
		int a=n.nextInt();
		char b=(char)a;
		float d=(float)a;
		byte f=(byte)a;
		System.out.println(d);
		System.out.println(b);
		System.out.println(f);
		n.close();
	}

}
