package qedge_class;

public class StringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "world";
		
		String resString = s1 + s2;
		
		String strFive = ""+5;			// "5"
		System.out.println(strFive);
		
		String strValue = ""+2.5;
		System.out.println(strValue);
		
		String strFiften = String.valueOf(15);
		System.out.println(strFiften);
	}

}
