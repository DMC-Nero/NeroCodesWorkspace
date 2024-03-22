package qedge_class;

public class Pooling {

	public static void main(String[] args) {
		//integer object pooling
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		System.out.println(i1 == i2);
		
		//Literal kind of syntax
		Integer i3 = 11;		//Autoboxing
		Integer i4 = 11;		//Autoboxing
		
		System.out.println(i3 == i4); 		//true
		
		Integer i5 = -129;
		Integer i6 = -129;
		System.out.println(i5 == i6); 		//false
		
		//JVM pools Integer object between range of -128 to 127
		
		Boolean b1 = true;
		Boolean b2 = true;
		System.out.println(b1 == b2);		//true
		
		Boolean b3 = false;
		Boolean b4 = false;
		System.out.println(b3 == b4); 		//true
		
		//JVMS also pools Boolean objects 
		
	}

}
