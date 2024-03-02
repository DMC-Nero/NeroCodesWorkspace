package qedge_class;

public class FactoryMethod {

	public static void main(String[] args) {

		FactoryMethod_demo2 st1 = FactoryMethod_demo1.creatStudentWithData(123, "jack");		//assigning values to object st1 of demo type
		st1.printStudentInfo();																	//invoking method printStudentInfo

		FactoryMethod_demo2 st2 = FactoryMethod_demo1.creatStudentWithData(234, "Nero");		//assigning values to object st2 of demo type
		st2.printStudentInfo();																	//invoking method printStudentInfo
	}

}

class FactoryMethod_demo2 {																		//class to creating object of demo type
	int sid;																					//instance variable 
	String sname;																				//instance variable

	public void printStudentInfo() {															//method to print sid and sname 
		System.out.println("sid : " + sid + " sname : " + sname);								//printing sid and sname 
	}
}

class FactoryMethod_demo1 {																		//new class for assigning address to pointer
	public static FactoryMethod_demo2 creatStudentWithData(int sidInput, String snameInput) {	//static method with return value and parameters sid and sname
		FactoryMethod_demo2 s1 = new FactoryMethod_demo2();										//creating object s1 of demo type
		s1.sid = sidInput;																		//assigning sidInput to s1.sid
		s1.sname = snameInput;																	//assigning snameInput to s1.sname
		return s1;																				//returning s1 object
	}
}
