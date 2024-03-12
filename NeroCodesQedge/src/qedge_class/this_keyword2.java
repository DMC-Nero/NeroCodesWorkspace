package qedge_class;

public class this_keyword2 {

	public static void main(String[] args) {
		System.out.println("main start");
		
		thisStudent2 s1 = new thisStudent2();
		s1.printStudentInfo();
		
		thisStudent2 s2 = new thisStudent2(2,"Nero");
		s2.printStudentInfo();
		
		System.out.println("main end");
	}

}
class thisStudent2{
	int sid;
	String sname;
	thisStudent2(){
		this(-1, "No-Name");
	}
	
	thisStudent2(int sid, String sname){
		System.out.println("Student(int,String) constructor");
		this.sid = sid;
		this.sname = sname;
	}
	public void printStudentInfo() {
		System.out.println("sid is : " + sid + " sname is : " + sname);
	}
}
