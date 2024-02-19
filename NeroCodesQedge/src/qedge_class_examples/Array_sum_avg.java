package qedge_class_examples;

public class Array_sum_avg {

	public static void main(String[] args) {
		int[] arr = new int[] { 47, 38, 27, 48, 23 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int avg = sum / arr.length;
		System.out.println("sum of the array " + sum);
		System.out.println("avg of the array " + avg);
	}

}
