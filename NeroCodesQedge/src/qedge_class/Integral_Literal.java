package qedge_class;

public class Integral_Literal {
	public static void main(String[] args) {
		int a = 69;
		System.out.println("the value of a " + a);
		int b = 01473;
		System.out.println("the value of b " + b);
		int c = 0X234acd;
		System.out.println("the value of c " + c);
		int d = 0B110101;
		System.out.println("the value of d " + d);

		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toHexString(d));
		System.out.println(Integer.toOctalString(b));

	}
}
