package qedge_class;

public class StaticNestedClass {

	public static void main(String[] args) {
		Outer.StaticNested sn = new Outer.StaticNested();
		sn.fun1();
		
		Outer o1 = new Outer();
		o1.m1();
	}

}

class Outer {
	int x;
	static int y;

	public static void m1() {
		System.out.println("m1 of Outer class");

		StaticNested sn = new StaticNested();
		sn.fun1();

	}

	public void m2() {
		System.out.println("m2 of Outer class");

		StaticNested.fun2();
	}
	// A nested class is a complete class: it can contain everything that a java class can contain.

	static class StaticNested {
		int a;
		static int b;

		public void fun1() {
			System.out.println("fun1 of StaticNested");
			StaticNested sn = new StaticNested();
			System.out.println(a + " - " + sn.a);
			System.out.println(b + " - " + sn.b + " - " + StaticNested.b);

			// Accessing member of Outer class
			// System.out.println(x);

			Outer outer = new Outer();
			System.out.println(outer.x);

			System.out.println(y + outer.y + " - " + Outer.y);

		}

		public static void fun2() {
			System.out.println("fun2 of StaticNested");
			StaticNested sn = new StaticNested();
			System.out.println(sn.a);

			System.out.println(b + " - " + sn.b + " - " + StaticNested.b);

			// Accessing member of Outer class
			// System.out.println(x);

			Outer outer = new Outer();
			System.out.println(outer.x);

			System.out.println(y + outer.y + " - " + Outer.y);

		}
	}
}