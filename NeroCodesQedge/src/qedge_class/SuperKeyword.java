package qedge_class;

public class SuperKeyword {

	public static void main(String[] args) {
		SupMCAStudent s1 = new SupMCAStudent();
		s1.checkThings();
	}

}

class SupStudent {
	int sid = 111;
	String sname = "Jack";
	
	public void read() {
		System.out.println("read of student");
	}
}

class SupMCAStudent extends SupStudent{
	int sid = 69;
	String sname = "Nero";
	
	public void read() {
		System.out.println("read of MCAStudent");
	}
	
	public void checkThings() {
		System.out.println(sid + " - " + sname);
		System.out.println("super class member: "+ super.sid +" - " + super.sname);
		
		read();
		
		super.read();
		
	}
}