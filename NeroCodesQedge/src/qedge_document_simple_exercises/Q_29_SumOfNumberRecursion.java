package qedge_document_simple_exercises;

public class Q_29_SumOfNumberRecursion {
	public static void main(String[] args) {
		int n = 123;
		Q_29_SumOfNumberRecursion obj = new Q_29_SumOfNumberRecursion();
		int a = obj.add(n);
		
		System.out.println("Sum : "+a);

	}

		int add(int n) {
		int sum = 0;
		final int a;
		
		sum = n % 10;
		if (n == 0) {
			return 0;
		} else {
			a = sum + add(n/10);
			return a;
		}
	}

}
