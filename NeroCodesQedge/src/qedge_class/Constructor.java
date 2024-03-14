package qedge_class;

public class Constructor {

	public static void main(String[] args) {
		conDemo d1 = new conDemo();

		conSample s1 = new conSample();

		conSample s2 = new conSample();

		conStudent st1 = new conStudent();
		System.out.println("sid : " + st1.sid + " sname : " + st1.sname);

		conStudent st2 = new conStudent();
		System.out.println("sid : " + st2.sid + " sname : " + st2.sname);
	}

}

//No-arg constructor example
class conDemo {
	// This class contains a default constructor provided by the compiler
}

class conSample {
	conSample() { // No-argumented constructor
		// constructor can be used intelligently to initialize the instance member of
		// the class
		System.out.println("Sample() constructor");
	}
}

class conStudent {
	int sid;
	String sname;

	conStudent() {
		System.out.println("Student() constructor");
		sid = 111;
		sname = "No-Name";
	}
}