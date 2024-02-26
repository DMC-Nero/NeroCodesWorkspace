package qedge_class;
public class Static_rule_4 {
	public static void main(String[] args) throws Exception{
		System.out.println("main start");
		
		// invoking a reflective method
		Class.forName("NeroCodesWorkspace1.Static_rule_4_demo");
		
		System.out.println("main end");
	}
}
class Static_rule_4_demo{
	static {
		System.out.println("static block of Static_rule_4_demo class");
	}
}
