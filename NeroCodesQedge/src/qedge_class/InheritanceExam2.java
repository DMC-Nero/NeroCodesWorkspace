package qedge_class;

public class InheritanceExam2 {

	public static void main(String[] args) {
		
		Object o1 = null;
		
		o1 = new Object();
		o1 = new InhStudent();
		o1 = new InhBtechStudent();
		o1 = new InhMtechStudent();
		
		System.out.println("////////////////");
		
		InhStudent s1 =null;
		// s1 = new Object();
		s1 = new InhStudent();
		System.out.println(s1);
		
		s1 = new InhBtechStudent();
		System.out.println(s1);
		
		s1 = new InhMtechStudent();
		System.out.println(s1);
		
		System.out.println("////////////");
		
		InhBtechStudent s2 = null ;
		//s2 = new Object();		//invalid
		//s2. = new Student();		//invalid
		
		s2 = new InhBtechStudent();
		System.out.println(s2);
		
		s2 = new InhMtechStudent();
		System.out.println(s2);
		
		System.out.println("////////////");
		
		InhMtechStudent s3 = null;
		//s3 = new Object();
		//s3 = new Student();
		//s3 = new BtechStudent();
		
		s3 = new InhMtechStudent();
		
		System.out.println("///////////////");
		//accessing member using the reference variable 
		System.out.println(o1.hashCode());
		
		s1.read();
		
		s2.coding();
		s2.read();
		s2.hashCode();
		
		s3.researchWork();
		s3.coding();
		s3.read();
		s3.hashCode();
		
	}

}

class InhStudent{
	int sid = 1;
	String sname;
	
	public void read() {
		System.out.println("reading....");
	}
	
	public void write() {
		System.out.println("writing...");
	}
}

class InhBtechStudent extends InhStudent{
	public void coding() {
		System.out.println("BtechStudent coding...");
	}
}

class InhMtechStudent extends InhBtechStudent{
	public void researchWork() {
		System.out.println("MtechStudent researchWord");
	}
}

