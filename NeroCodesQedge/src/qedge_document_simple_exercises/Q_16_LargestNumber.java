package qedge_document_simple_exercises;

public class Q_16_LargestNumber {

	public static void main(String[] args) {
		int a = 52, b = 563, c = 63;
		if (a > b && a > c) {
			System.out.println(a + " is the largest of all");
		} else if (b > c) {
			System.out.println(b + " is the largest of all");
		} else {
			System.out.println(c + " is the largest of all");
		}
	}

}
