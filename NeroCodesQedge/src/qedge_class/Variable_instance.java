package qedge_class;

public class Variable_instance {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Student s0 = null;
		System.out.println(s0);
		System.out.println("===========");
		
		Student s1=new Student();
		System.out.println(s1);
		System.out.println("sid is "+ s1.sid);
		System.out.println("sname is "+ s1.sname);
		System.out.println("course is "+ s1.course);
		System.out.println("dayScolar is "+ s1.dayScholar);
		
		System.out.println("===========");
		
		Student s2=new Student();
		System.out.println(s2);
		System.out.println("sid is "+ s2.sid);
		System.out.println("sname is "+ s2.sname);
		System.out.println("course is "+ s2.course);
		System.out.println("dayScolar is "+ s2.dayScholar);
		
		System.out.println("main end");
	}
	
}
class Student{
	int sid;
	String sname;
	String course;
	String dayScholar;
}

