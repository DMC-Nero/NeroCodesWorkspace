package qedge_class;

public class TypeCastingComplex {

	public static void main(String[] args) {
		int x = 10;
		byte b1 = (byte) x;	//primitive type cast
		
		// complex type casting is only applicable between the types within an inheritance hierarchy.
		
		StudentType s1 = new MTechStudentType();
		s1.read();
		
		BTechStudentType bs = (BTechStudentType)s1;
		bs.read();
		bs.btechWrite();
		
		MTechStudentType ms = (MTechStudentType)s1;
		ms.read();
		ms.btechWrite();
		ms.researchWork();
		
		System.out.println("======================");
		StudentType s2 = new BTechStudentType();
		s2.read();
		
		//BTechStudent bs2 = s2; 		//invalid
		BTechStudentType bs2 = (BTechStudentType)s2;
		bs2.read();
		bs2.btechWrite();
		
		MTechStudentType ms2 = (MTechStudentType)s2;		// ClassCastException
		
		//classes that not related inherently can't be applied with type casting
		// MBAStudent mba = (MBAStudent)s1;		//invalid  -CE
		
		Object o1 = new MTechStudentType();
		StudentType s3 = (MTechStudentType)o1;
	}

}

class StudentType{
	public void read() {
		System.out.println("Student read()");
	}
}

class BTechStudentType extends StudentType{
	public void btechWrite() {
		System.out.println("btechStudent write");
	}
}

class MTechStudentType extends BTechStudentType {
	public void researchWork() {
		System.out.println("MTechStudent researchWork");
	}
}

class MBAStudentType{
	
}
