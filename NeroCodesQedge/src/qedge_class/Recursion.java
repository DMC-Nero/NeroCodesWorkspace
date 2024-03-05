package qedge_class;
public class Recursion {
	public static void main(String[] args) {
		lol(10);
	}
	
	public static void lol(int x) {
		if(x!=0) {
		System.out.println("Hello-------,"+x);
		}else {
			return;
		}
		lol(x-1);
	}
	public static void lol2() {
		System.out.println("Hello lol2 here");
		lol2();		//create infinite recursion [StackOverflowError]
	}
}
