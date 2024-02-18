package qedge_document_exercises;

import java.util.*;

public class Long_to_byte_Conversion {
	public static void main(String[] args) {
		long a;
		byte b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the Long value");
		a = s.nextLong();
		b = (byte) a;
		System.out.println("convertion into byte is: " + b);
		s.close();
	}

}
