package qedge_class;

public class LocalInnerClass {
	int x;
	static int y;

	public static void main(String[] args) {
		LocalInnerClass a1 = new LocalInnerClass();
		a1.fun1();
	}
	
	public void fun1() {
		System.out.println("fun1 started");
		int p = 10;
		
		class LocalInn {
			int a;
			static int b;
			
			public void m1() {
				
				LocalInn l1 = new LocalInn();
				System.out.println("m1 of Local"+ a+" - "+ b+ " - "+l1.b+" - "+LocalInn.b);
				System.out.println("x value is "+ x);
				System.out.println("y value is "+ y);
				System.out.println("p value is "+ p);
				// p =20;	
			}
			public static void m2() {
				System.out.println("m2 of Local");
				LocalInnerClass a1 = new LocalInnerClass();
				System.out.println("x value is "+ a1.x);
				System.out.println("y value is "+ y);
					
			}
			
			{
			LocalInn l1 = new LocalInn();
			l1.m1();
			
			LocalInn.m2();
			}
			
		}

		System.out.println("fun1 ending...");
	}
}
