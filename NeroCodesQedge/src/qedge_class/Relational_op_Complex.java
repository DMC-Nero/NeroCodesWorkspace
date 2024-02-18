package qedge_class;

public class Relational_op_Complex {
	public static void main(String[] args) {
		boolean res = 2 == 3;
		System.out.println("2 == 3 =>" + res);

		res = true == false;
		System.out.println("true == false =>" + res);

		res = true == true;
		System.out.println("true == true =>" + res);

		float f1 = 2.5f;
		float f2 = 2.56f;
		res = f1 == f2;
		System.out.println("f1 == f2 =>" + res);

		Sample1 s1 = new Sample1();
		Sample1 s2 = new Sample1();
		res = s1 == s2; // address comparision
		System.out.println("s1== s2 =>" + res);

		Sample1 s3 = s1; // address copying
		res = s1 == s3;
		System.out.println("s1 == s3 =>" + res);

		String st1 = new String();
		String st2 = new String();
		res = st1 == st2;
		System.out.println("st1 == st2 =>" + res);

	}

}

class Sample1 {

}
