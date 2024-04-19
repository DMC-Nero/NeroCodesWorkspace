package qedge_class;

public class Cloning_example {

	public static void main(String[] args) throws CloneNotSupportedException{
		AddressClone addr1 = new AddressClone("Ameerpet");
		StudentClone st1 = new StudentClone(1,"Nero",addr1);
		
		StudentClone cloned = (StudentClone)st1.clone();
		
		System.out.println(st1);
		
		System.out.println(cloned);
	}

}


//////////////////////////////////////////////////////////////////////////
class AddressClone {
	String address;
	
	public AddressClone(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "[address=" + address + "] "+ super.toString();
	}
}
//////////////////////////////////////////////////////////////////////////
class StudentClone implements Cloneable {
	int sid;
	String sname;
	AddressClone stAddress;
	
	public StudentClone(int sid,String sname, AddressClone stAddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.stAddress = stAddress;
	}
	
//	shallow copy
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	//Deep copy
	public Object clone() throws CloneNotSupportedException {
		//st1.clone(); 		this = st1
		StudentClone clonedStudent = (StudentClone)super.clone();
		AddressClone clonedStudentAddress = new AddressClone(this.stAddress.address);
		clonedStudent.stAddress = clonedStudentAddress;
		return clonedStudent;
	}
	
	public String toString() {
		return super.toString() + "[sid=" + sid + ", sname= "+sname + ", stAddress="+ stAddress + "]";
	}
	
}