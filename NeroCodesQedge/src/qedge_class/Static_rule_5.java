package qedge_class;
public class Static_rule_5 {
	static {
		System.out.println("static block of Static_rule_5");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		//5.The initialization of subclass of class.
		MCAStudent st = new MCAStudent();
		System.out.println("main end");
		
	}
}
class Static_rule_5_demo {
	static {
		System.out.println("static block of Static_rule_5_demo class");
	}
}
class MCAStudent extends Static_rule_5_demo {
	static {
		System.out.println("static block fo MCAStudent");
	}
}
