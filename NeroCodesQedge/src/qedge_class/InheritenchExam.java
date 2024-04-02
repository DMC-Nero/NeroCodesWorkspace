package qedge_class;

public class InheritenchExam {
	
	static public void main(String[] args) {
	InMcaStudent s1 = new InMcaStudent();
	System.out.println(s1.sid);
	System.out.println(s1.sname);
	
	s1.read();
	s1.write();
	s1.show();
	InMcaStudent.games();
	}
	
}

class InStudent{
	int sid = 1;
	String sname;
	
	public void read() {
		System.out.println("reading...");
		
	}
	public void write() {
		System.out.println("writing...");
		
	}
	public static void games() {
		System.out.println("playing games..");
	}
}

class InMcaStudent extends InStudent{
	//ind sid = 11; 	//field hiding [not recommended]
	
	String specialization;
	
	//Brand new method in subclass
	public void show() {
		System.out.println("mca sid is "+sid);
		System.out.println("student sid "+ super.sid);
		
		System.out.println("sname is " + sname);
		
		System.out.println("specialization "+ specialization);
		
		read();
		write();
		
	}
	
	//method overriding 
	public void read() {
		System.out.println("MCAStudent is reading...");
	}
	
	//method hiding 
	public static void games() {
		System.out.println("MCAStudent playing...");
	}
	
}
