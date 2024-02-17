package qedge_class;

public class FloatingPoint {

	public static void main(String[] args) {
				//float f1=2.5;			//invalid
				float f2 = 2.5f;
				
				double d1 = 2.5;
				double d2 = 2.5f;
				
				//float f3=2.5e1;		//invalid
				System.out.println("f2 value is "+f2);
				System.out.println("d1 value is " +d1);
				System.out.println("d2 value is " + d2);
				float f4= 2.5e1f;
				System.out.println("f4 value is "+ f4);
				
				double d3 =2.5e2;
				System.out.println("d3 value is "+ d3);
				
				double d4 = 2e3f;
				System.out.println("d4 value is "+ d4);
				String s1="\"Hello\"world\"";
				System.out.println(s1);
	}

}
