package qedge_class;
public class Constructor_Argument {
	public static void main(String[] args) {
		conArgStudent s1 = new conArgStudent(1,"jack");
		s1.printStudentData();
		
		conArgStudent s2 = new conArgStudent(2,"Nero");
		s2.printStudentData();
		
		conArgStudent s3 = new conArgStudent(3,"Dante");
		s3.printStudentData();
		
	}
}
//parameterized constructor
class conArgStudent{
	int sid;
	String sname;
	
	//Augmented constructor allows to initialize the object with supplied value
	//parameterized constructor
	conArgStudent(int id, String name){
		sid = id;
		sname = name;
	}
	
	public void printStudentData() {
		System.out.println("sid "+sid + " sname "+ sname);
	}
}
