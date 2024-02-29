package qedge_class;

public class Methods {

	public static void main(String[] args) {
		int sum=Methods.sum(10, 5);							//method calling
		System.out.println("the sum of the value "+sum);
		int diff=Methods.diff(10, 7);						//method calling
		System.out.println("the diff of the vlaue "+diff);
	}
	public static int sum(int a,int b) {
		int res = a + b;
		return res;
	}
	public static int diff(int a, int b) {
		int res = a - b;
		return res;
	}

}
