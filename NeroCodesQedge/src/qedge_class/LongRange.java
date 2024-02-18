package qedge_class;

public class LongRange {
	public static void main(String[] args) {
		long l1 = 25;
		long l2 = 2147483647;
		long l3 = 2147483648L;
		// long l4=2147483648; //invalid
		long l5 = -9223372036854775808L;
		long l6 = 9223372036854775807L;
		// long l7=-9223372036854775809L; //invalid
		// long l8= 9223372036854775808L; //invalid
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l5);
		System.out.println(l6);

	}
}
