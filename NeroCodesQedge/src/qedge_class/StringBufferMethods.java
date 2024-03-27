package qedge_class;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("javaworld"); // backing array capacity:25

		System.out.println(sb1); // print the content

		sb1.append(10);
		System.out.println(sb1);

		System.out.println(sb1.capacity());
		System.out.println(sb1.length());

		// javaworls10
		StringBuffer sb2 = sb1.delete(4, 9);
		System.out.println(sb1);

		System.out.println(sb1 == sb2);

		sb1.ensureCapacity(1000);

		System.out.println(sb1.capacity());
		System.out.println(sb1.length());

		System.out.println(sb1);
		System.out.println(sb1.reverse());

		sb1.setLength(10);
		System.out.println(sb1);

		System.out.println(sb1.capacity());
		System.out.println(sb1.length());

		sb1.trimToSize();
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
	}

}
