package qedge_class;

public class NonStaticAcess_1 {

	// Non-static data member with Member function
	// Non-static data member / variables
	int sid;
	String sname;
	String course;

	// Non-static member function / methods
	public void read() {
		System.out.println("read() of Student");
	}

	public void write() {
		System.out.println("write() of Student");
	}

}
