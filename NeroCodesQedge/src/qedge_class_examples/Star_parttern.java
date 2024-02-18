package qedge_class_examples;

public class Star_parttern {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();

			i++;
		}
		int a = 1;
		while (a <= 5) {
			int b = 5;
			while (b >= a) {
				System.out.print("*");
				b--;
			}
			System.out.println();

			a++;
		}

	}

}
