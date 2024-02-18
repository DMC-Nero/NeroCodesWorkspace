package qedge_class;

public class Nested_while_loop {

	public static void main(String[] args) {
		// outer loop[loop counter initialization , condition , incre/decre]
		int i = 1;
		while (i <= 3) {
			System.out.println("Outer Loop #" + i);

			// inner loop [ loop counter initialization ,condition, ince/decre]
			int j = 1;
			while (j <= 5) {
				System.out.println("\tInner Loop #" + j);
				j++;
			} // inner loop end
			i++;

		} // outer loop end
	}

}
