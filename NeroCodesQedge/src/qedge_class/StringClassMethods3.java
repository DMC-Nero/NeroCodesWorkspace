package qedge_class;

public class StringClassMethods3 {

	public static void main(String[] args) {
		
		String s1 = "hello world";
		System.out.println(s1.length());
		
		String str = "Welcome to geeksforgeeks";
		
		//Testing if regex is present or not 
		System.out.println(  str.matches(  "(.*)geeks(.*)"  )    ); //true	//pattern Matching
		
		//Testing if regex is present or not 
		System.out.println(str.matches("geeks"));	//false
		
		String str1 = "geeks";
		System.out.println(str1.matches("geeks"));	//true
		
		//compare regions between two string
		String str2 = "Welcome to geeksforgeeks";
		boolean first5Match = str.regionMatches(0,str2,0,5);
		System.out.println(first5Match);
		
		boolean first5Match2 = str.regionMatches(true, 0, str2,0,5);
		System.out.println(first5Match2);
		String s2 = "java";
		String java5Times = s2.repeat(5);
		System.out.println(java5Times);
		
		String replacedStirng = s2.replace('j','l');
		System.out.println(s2);
		
		System.out.println(replacedStirng);
		
		String helloMessage = str2.replace("Welcome","Hello");
		System.out.println(str2);
		System.out.println(helloMessage);
	}

}
