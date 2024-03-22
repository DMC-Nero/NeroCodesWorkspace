package qedge_class;

public class StringPool {

	public static void main(String[] args) {
		char[] carr = {'j','a','v','a'};
		
		String s1 = new String(carr);
		System.out.println(s1);
		
		String s2 = new String(carr);
		System.out.println(s2);
		
		System.out.println("s1 == s2 "+ (s1 == s2));
		
		String s3 = "hello";
		String s4 = "hello";
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("s3 == s4 "+ (s3 == s4));
	}

}
