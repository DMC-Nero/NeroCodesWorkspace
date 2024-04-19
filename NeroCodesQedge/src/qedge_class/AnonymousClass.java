package qedge_class;

public class AnonymousClass {

	public static void main(String[] args) {
		
		AnnSample s1 = new AnnSample() {
			public void m2() {
				super.m2();
				System.out.println("m2 of anonymous class");
			}
		};
		
		s1.m1();
		s1.m2();
		
		System.out.println("////////////////////");
		
		Intf12 i1 = new Intf12() {
			public void fun1() {
				System.out.println("fun1 of anonymous class");
			}
		};
		
		i1.fun1();
		
		System.out.println("///////////////////");
		
		
		System.out.println("////////////////////////");
		doThings(new PlaceHolder());
		
		Intf12 iOne = new PlaceHolder();
		doThings(iOne);
		
		System.out.println("/////////////////////");
		doThings(new Intf12(){
			public void fun1() {
				System.out.println("some kind of logic goes here");
			}
		});
		
		System.out.println("////////////");
		doThings(new Intf12() {
			public void fun1() {
				System.out.println("some other kind of logic goes here");
			}
		});
		
		
	}
	
	public static void doThings(Intf12 i1) {
		System.out.println("doThings started");
		i1.fun1();
		System.out.println("doThings ending...");
		
	}

}//App



//Anonymous class Example

class AnnSample {
	public void m1() {
		System.out.println("m1 of Sample");
	}
	public void m2() {
		System.out.println("m2 of Sample");
	}
}

interface Intf12{
	public void fun1();
}

class PlaceHolder implements Intf12 {
	public void fun1() {
		System.out.println("fun1 fo PlaceHolder");
	}
}
