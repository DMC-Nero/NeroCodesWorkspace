package qedge_class;

public class Logical_AND_OR_operators {
	public static void main(String[] args) {
		boolean res =20>3 && m1();
		System.out.println(res);
		
		int x=10;
		int y=5;
		
		boolean lol= x<y || x++==y; 
		System.out.println(x);
		System.out.println(lol); 
		
	}
	public static boolean m1(){
		System.out.println("hi bro");
		return false;
	}

}
