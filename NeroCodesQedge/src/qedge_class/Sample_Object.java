package qedge_class;

public class Sample_Object {
	public static void main(String[] args) {
		Samples s0=null;
		new Samples();
		//A sample object created, whose address is not stored in any reference variable
		Samples s1 = new Samples();
		System.out.println("s0 address "+s0);
		System.out.println("s1 address "+s1);
		//when printing a refernce variable using println() method,
		//it prints object address in the following format
			// class_name@Address
		Samples s2=new Samples();
		System.out.println("s2 address "+s2);
		Samples s3=s2;	//address copying 
		System.out.println("s3 address "+ s3);
		System.out.println("s1==s2"+(s1==s2));
		System.out.println("s2==s3"+(s2==s3));
		
	}

}
class Samples{
	
}
