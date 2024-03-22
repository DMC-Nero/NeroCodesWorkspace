package qedge_class;

public class StringIntern {

	public static void main(String[] args) {
		char[] carr = {'j','a','v','a'};
		
		String s1 = new String(carr);
		
		String internedString = s1.intern();
		
		String s2 = "java";
		System.out.println("internedString == s2"+ (internedString == s2));
		
		/////////////////
		String s3 = "hello";
		String internedString2 = s3.intern();
		
		System.out.println("internedString2 == s3"+ (internedString2 == s3));
		
		
	}

}
