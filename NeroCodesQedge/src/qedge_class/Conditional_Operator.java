package qedge_class;

public class Conditional_Operator {
	public static void main(String[] args) {
		boolean res = true ? true : false;
		System.out.println(res);

		res = false ? true : false;
		System.out.println(res);

		String res2 = 2 > 3 ? "Hello" : "Hi";
		System.out.println(res2);

		double res3 = 2 > 3 ? 5.7 : 1.1;
		System.out.println(res3);

		int x = 10;
		int res4 = x > 1 && x == 10 ? x + 10 : x - 10;
		System.out.println(res4);

		// Nesting the conditional operator
		int res5 = 20 > 5 ? 2 != 2 ? 100 : 200 : 300;
		System.out.println(res5);

		int res6 = 20 > 50 ? 2 != 2 ? 100 : 200 : 2 > 5 || 3 == 3 ? 555 : 666;
		System.out.println(res6);

	}// Main end

} // Test end
