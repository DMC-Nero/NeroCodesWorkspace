package qedge_class;

public class Increment_operator {
	public static void main(String[] args) {
		int a = 23;
		int b = 72;
		int res = a++ + b++ + a++ + a++ + b++;
		System.out.println(a); // 26
		System.out.println(b); // 74
		System.out.println(res); // 217

		int x = 1;
		int y = 1;
		int z = --x + y++ - x++ + ++y;
		System.out.println(x); // 1
		System.out.println(y); // 3
		System.out.println(z); // 4

	}

}
