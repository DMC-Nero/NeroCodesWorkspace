package qedge_class;

public class DynamicPloymer {

	
		
	public static void testThings(polyA a1) {
		System.out.println("testThings(A) method called");
		
		//null checking
		if(a1 != null) {
			a1.fun1();
			a1.fun2();
			a1.fun3();
			a1.hashCode();
		}
		
	}
	
	public static void testOtherThings(polyB b1) {
		System.out.println("testOtherThings(B) mehtod called");
		
		//null checking
		if(b1 != null) {
			b1.fun1();
			b1.fun2();
			b1.fun3();
			b1.fun4();
			b1.hashCode();
		}
		
		
	}
	
	public static void testSomeOtherThings(polyC c1) {
		System.out.println("testSomeOtherThings(C) mehtod called");
		
		//null checking
		if(c1 != null) {
			c1.fun1();
			c1.fun2();
			c1.fun3();
			c1.fun4();
			c1.fun5();
			c1.hashCode();
		}
		
		
	}
	public static void testSomeThingElse(polyD d1) {
		System.out.println("testSomeThingElse(D) mehtod called");
		
		//null checking
		if(d1 != null) {
			d1.fun1();
			d1.fun2();
			d1.fun3();
			d1.fun4();
			d1.fun5();
			d1.fun6();
			d1.hashCode();
		}
		
		
	}
	
	public static void main(String[] args) {
		// testThings(null);
		testThings(new polyA());
		
		System.out.println("============");
		testThings(new polyB());
		
		System.out.println("============");
		polyC c1 = new polyC();
		testThings(c1);
		System.out.println("=============");
		polyD d1 = new polyD();
		testThings(d1);

		System.out.println("##################");
		//testOtherThing(new polyA());			//invalid
		testOtherThings(new polyB());
		System.out.println("=============");
		testOtherThings(new polyC());
		System.out.println("=============");
		testOtherThings(new polyD());
		
		System.out.println("##################");
		
		//testSomeOtherThings(new polyA());		//invalid
		//testSomeOtherThings(new polyB());		//invalid
		testSomeOtherThings(new polyC());
		System.out.println("==============");
		testSomeOtherThings(new polyD());
		
		System.out.println("################");
		//testSomeThingElse(new polyA());		//invalid
		
		//testSomeThingElse(new polyB());		//invalid
		
		//testSomeThingElse(new polyC());		//invalid
		
		testSomeThingElse(new polyD());
		
		
	}
	
	
	

}
class polyA{
	public void fun1() {
		System.out.println("fun1 of A");
	}
	public void fun2() {
		System.out.println("fun2 of B");
	}
	public void fun3() {
		System.out.println("fun3 of B");
	}
}

class polyB extends polyA{
	public void fun2() {
		System.out.println("fun2 of B");
	}
	public void fun4() {
		System.out.println("fun4 of B");
	}
}

class polyC extends polyB{
	public void fun3() {
		System.out.println("fun3 of C");
	}
	public void fun1() {
		System.out.println("fun1 of C");
	}
	public void fun5(){
		System.out.println("fun5 of C");
	}
}

class polyD extends polyC{
	public void fun5() {
		System.out.println("fun5 of D");
	}
	
	public void fun6() {
		System.out.println("fun6 of D");
	}
	public void fun2() {
		System.out.println("fun2 of D");
	}
}
