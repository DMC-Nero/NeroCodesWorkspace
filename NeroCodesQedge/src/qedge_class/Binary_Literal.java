package qedge_class;

public class Binary_Literal {
	public static void main(String[] args) {
		byte aB = 0B10110;
		short aS = 0B10101;
		int a1 = 0B101010;
		int a2 = 0B101011;
		int ar = a1 + a2;
		System.out.println("byte value: " + aB);
		System.out.println("short value: " + aS);
		System.out.println("int value: " + a1);
		System.out.println("int value: " + a2);
		System.out.println("result of the binary: " + ar);
	}

}
