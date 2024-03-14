package qedge_class;

public class StaticNonStatic_Block {

	static {
		System.out.println("in static block of Exam class");
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		
		BlockStudent s1 = new BlockStudent();
		
		BlockStudent s2 = new BlockStudent(2,"jane");
		
		System.out.println("main end");
		
	}
}

class BlockStudent{
	int sid;
	String sname;
	static {
		System.out.println("in static block of BlockStudent");
	}
	
	{
		System.out.println("in non-static block of BlockStudent");
	}
	
	public BlockStudent() {
		System.out.println("in BlockStudent() constructor");
		sid = 1;
		sname = "jack";
	}
	
	public BlockStudent(int id,String name) {
		sid = id;
		sname = name;
	}
}