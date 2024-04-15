package qedge_class;

public class nonStaticNestedClass {

	public static void main(String[] args) {
		OuterNon.InnerNon i1 = new OuterNon().new InnerNon();
		i1.fun1();
		
		OuterNon.m1();
	}

}

class OuterNon {
	int x;
	static int y;
	
	public static void m1() {
		System.out.println("m1 of Outer");
		
		InnerNon i1 = new OuterNon().new InnerNon();
		i1.fun1();
		
		OuterNon o1 = new OuterNon();
		InnerNon i2 = o1.new InnerNon();
		i2.fun1();
		
		InnerNon.fun2();
		
	}
	public void m2() {
		System.out.println("m2 of Outer");
	}
	
	// A nested class is a complete class: it can contain everything that a java class can contain.
	// consider a non-static nested class as a non-static context of the outer class
	
	class InnerNon {
		int a;
		static int b;
		
		public void fun1() {
			System.out.println("fun1 of Inner");
			System.out.println(x);
			
			OuterNon o1 = new OuterNon();
			System.out.println(o1.x);
			
			System.out.println(y + " - "+ o1.y+ " - "+OuterNon.y);
			
		}
		public static void fun2() {
			System.out.println("fun2 of Inner");
			
			//System.out.println(x);  //enclosing class non-static member can't accessed directly here
			OuterNon o1 = new OuterNon();
			System.out.println(o1.x);
			
			System.out.println(y + " - " +o1.y+" - "+OuterNon.y);
			
			
			
			
			
		}
	}
}