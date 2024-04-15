package qedge_class;

public class InterfaceExamples {

	public static void main(String[] args) {
		System.out.println(Intf1.Max);
		Intf1.fun3();
		
		Intf1 i1 = new IntfSample();
		i1.fun1();
		i1.fun2();
		
	}

}

interface Intf1 {
	//static variable inside an interface
	public static final int Max = 10;
	
	// abstract method inside an interface
	void fun1();
	
	//default method [ kind of  a non-static implemented inside the interface ]  1.8 feature
	public default void fun2() {
		System.out.println("fun2 of Intf1");
	}
	
	//static method [ implemented inside the interface ] 1.8 feature
	public static void fun3() {
		System.out.println("fun3 of Intf1");

	}
}

class IntfSample implements Intf1{
	public void fun1() {
		System.out.println("fun1 of IntfSample class");
	}
	
}