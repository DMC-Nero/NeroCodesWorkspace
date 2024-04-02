package projects;
public class Exam{
	public static void main(String[] args) {
		Student s1 = new Student(111,"Nero");
		
	}
}

class Student{
	int sid ;
	String sname ;
	public Student(int sid,String sname){
		this.sid = sid;
		this.sname = sname;
		System.out.println("sid is " + sid + " sname is "+ sname);
	}
}
