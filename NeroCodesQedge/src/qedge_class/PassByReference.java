package qedge_class;

public class PassByReference {

	public static void main(String[] args) {

		PassByReference.processStudent(null);							// invoking method processStudent with null vlaue

		PassByReference_Demo s1 = new PassByReference_Demo();			// creating an object s1 of Demo type
		s1.sid = 111;													// assigning value to pointer s1.sid
		s1.sname = "Nero";												// assigning value to pointer s1.sname 

		PassByReference.processStudent(s1);								// calling method processStudent with s1 values
		s1.printStudnetInfo();											// printing the method to check the value is changed or not 
	}

	public static void processStudent(PassByReference_Demo st) { 		// creating a static method 
		if (st != null) { 												// to avoid null pointer exception
			st.printStudnetInfo();										// invoking non-method printStudentInfo
			st.sname = "NeroCodes";										// changing the string literal 
		}
	}

}

class PassByReference_Demo {											// class that creates an student object
	int sid; 													    	// instance variable
	String sname; 														// instance variable

	public void printStudnetInfo() {									// static is not used so this is also part of an object
		System.out.println("sid : " + sid + " sname : " + sname); 		// printing sid and sname
	}
}
