package qedge_class;
public class Static_rule_123 {
	
	static {
		System.out.println("static block of Static_rule_123 class ");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		
		//1.A new instanceof a class is being created.
//		Static_rule_123_demo s1 = new Static_rule_123_demo();
//		Static_rule_123_demo s2 = new Static_rule_123_demo();
		
//		2.Invocation of static method in a class
//		Static_rule_123_demo.m1();
		
//		3.The use or assignment of a static field
//		System.out.println(Static_rule_123_demo.universityName);
	}
}
class Static_rule_123_demo{
	static String universityName = "ABC";
	
	static {
		System.out.println("static block of Static_rule_123_demo class");
	}
	public static void m1() {
		System.out.println("m1 of Static_rule_123_demo class");
	}
}
