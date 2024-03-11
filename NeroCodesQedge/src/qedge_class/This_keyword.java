package qedge_class;

public class This_keyword {

	public static void main(String[] args) {
		System.out.println("main start");
		
		thisStudent s1 =new thisStudent();
		// allocate memory > default > encapsulate as object > invokes non-static block > invokes constructor
		
		s1.printStudentInfo(); //this non-static method runs for s1 pointed object
		
		System.out.println("===========");
		
		thisStudent s2 = new thisStudent(2,"Nero");
		s2.printStudentInfo();
		// allocate memory > default > encapsulate as object > invokes non-static block > invokes constructor
		System.out.println("main end");
	}

}

class thisStudent{
	int sid;
	String sname;
	{
		System.out.println("in non-static block of student");
		System.out.println("this value is "+ this);
	}
	
	public thisStudent() {
		System.out.println("in Student() constructor");
		System.out.println("This value is "+ this);
		sid = 1;
		sname = "jack";
	}
	
	public thisStudent(int sid, String sname) {
		System.out.println("int Student(int,String) constructor");
		System.out.println("This value is "+ this);
		
		this.sid = sid;
		this.sname = sname;	
		
	}
	public void printStudentInfo() {
		System.out.println("sid is : " +sid+" sname is : "+ sname);
		System.out.println("This value is "+ this);
		System.out.println("sid is : "+ this.sid +" sname is : "+ this.sname);
	}
}