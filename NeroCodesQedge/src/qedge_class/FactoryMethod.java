package qedge_class;
public class FactoryMethod {

	public static void main(String[] args) {

		FactDemo2 st1 = FactDemo1.creatStudentWithData(123, "jack");							//assigning values to object st1 of demo type
		st1.printStudentInfo();																	//invoking method printStudentInfo

		FactDemo2 st2 = FactDemo1.creatStudentWithData(234, "Nero");							//assigning values to object st2 of demo type
		st2.printStudentInfo();																	//invoking method printStudentInfo
	}

}

class FactDemo2 {																				//class to creating object of demo type
	int sid;																					//instance variable 
	String sname;																				//instance variable

	public void printStudentInfo() {															//method to print sid and sname 
		System.out.println("sid : " + sid + " sname : " + sname);								//printing sid and sname 
	}
}

class FactDemo1 {																				//new class for assigning address to pointer
	public static FactDemo2 creatStudentWithData(int sidInput, String snameInput) {				//static method with return value and parameters sid and sname
		FactDemo2 s1 = new FactDemo2();															//creating object s1 of demo type
		s1.sid = sidInput;																		//assigning sidInput to s1.sid
		s1.sname = snameInput;																	//assigning snameInput to s1.sname
		return s1;																				//returning s1 object
	}
}
