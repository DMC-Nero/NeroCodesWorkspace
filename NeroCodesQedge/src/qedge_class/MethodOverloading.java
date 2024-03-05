package qedge_class;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading a1= new MethodOverloading();
		a1.fun1();				//which fun1()
		a1.fun1(10);			//which fun1()
		
		short s=10;
		a1.fun1(s);
		
		a1.fun1(10,20);			//which fun1()
		
		a1.m1("hello");
		
		a1.m1(new StringBuffer());
		
		//a1.m1(null);			//ambiguous error
		
	}
	
	public void fun1() {
		System.out.println("fun() of method");
	}
	public void fun1(int x) {
		System.out.println("fun1(int) of method");
	}
	public void fun1(short x) {
		System.out.println("fun1(short) of method");
	}
	public void fun1(long x) {
		System.out.println("fun1(long) of method");
	}
	public void fun1(double x) {
		System.out.println("fun1(double) of method");
	}
	public void fun1(int x,int y) {
		System.out.println("fun1(int,int) of method");
	}
	
	public void m1(String s1) {
		System.out.println("m1(String) of App");
	}
	public void m1(StringBuffer s2) {
		System.out.println("m1(StringBuffer) of App");
	}
	
	

}
