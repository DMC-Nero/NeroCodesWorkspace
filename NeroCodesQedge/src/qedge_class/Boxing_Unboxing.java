package qedge_class;

public class Boxing_Unboxing {

	public static void main(String[] args) {
		
		BoxingSample s1= new BoxingSample();
		int x = 10;
		Integer i1 = new Integer(x);
		//the most of the wrapper class constructors are being deprecated.
		System.out.println(i1); 	//don't print the object address, but print the object content
		
		Integer i2 = new Integer("45");		// Manual boxing
		System.out.println(i2);
		
		//boxing using valueOf() method
		Integer i3 = Integer.valueOf(x);	//Manual boxing
		System.out.println(i3);//dont print the object address, but print the object content
		
		Integer i4 = Integer.valueOf("45");
		System.out.println(i4);
		
		String st1 = new String("Hello");
		System.out.println(st1); 	//prints object content
		
		double d = 2.5;
		Double d1 = new Double(d);
		System.out.println(d1);
		
		Double d2 = new Double("3.5");
		System.out.println(d2);
		
		Double d3 = Double.valueOf(d);
		System.out.println(d3);
		
		Double d4 = Double.valueOf(st1);
		System.out.println(d4);
		
		//unboxing
		int unboxedValue = i1.intValue();
		System.out.println(unboxedValue);
		
		unboxedValue = i3.intValue();
		System.out.println(unboxedValue);
		
		double unboxedValue2 = d1.doubleValue();
		System.out.println(unboxedValue2);
		
	}

}

class BoxingSample {
	
}
