package qedge_class;

public class StringClassMethods {

	public static void main(String[] args) {
		String s1 = "javaworld";
		
		char ch = s1.charAt(0);
		
		int codePointAt1 = s1.codePointAt(1);
		System.out.println(codePointAt1);
		
		int codePointOfJ = s1.codePointBefore(1);
		System.out.println(codePointOfJ);
		
		int count = s1.codePointCount(1,5);
		System.out.println(count);
		
		int diff = s1.compareTo("javaUniverse");
		System.out.println(diff);
		
		String s2 = "a";
		int diff2 = s2.compareTo("A");
		System.out.println(diff2);
		
		int diff3 = s2.compareToIgnoreCase("A");
		System.out.println(diff3);
		
		String s3 = s1.concat("hello");
		//concat() produce a new Stirng object by combining this stirng and argument string
		
		System.out.println(s1);
		System.out.println(s3);
		
		String s4 = "If people knew how hard I worked to get my mastery, it wouldn't seem so wonderful after all.";
		
		boolean contains = s4.contains("worked");
		System.out.println(contains);
		
		String s5 = "Alber Einstein";
		boolean equals = s5.contentEquals("Albert");
		System.out.println(equals);
		
		char[] charr = {'j','a','v','a'};
		String newString = String.copyValueOf(charr);
		System.out.println(newString);
	
	
	}

}
