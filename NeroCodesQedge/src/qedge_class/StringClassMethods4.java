package qedge_class;

public class StringClassMethods4 {

	public static void main(String[] args) {
		String s1 ="hello world";
		
		System.out.println(s1.startsWith("hello"));
		
		if(s1.startsWith("hello")) {
			//do something
		}else {
			//do something
		}
		
		String s2 = "Any intelligent fool can make things bigger, more complex, and more violent";
		System.out.println(s2.startsWith("fool",16));
		
		String s3 = "  java  ";
		System.out.println(s3.length());
		
		String s4 = s3.strip();
		System.out.println(s4.length());
		System.out.println(s3.length());
		
		String html = """
				     <html>
				     <body>
				     <p>Hello, world</p>
				     </body>
				     </html>
				     """;
		System.out.println(html.stripIndent());
		
		//s3 = "  java  "
		System.out.println(s3.stripLeading().length());
		System.out.println(s3.stripTrailing().length());
		
		String s5 = "hello world";
		System.out.println(s5.subSequence(1,4));
		
		System.out.println(s5.substring(6));
		System.out.println(s5.substring(1, 4));
		
		char[] carr = s5.toCharArray();
		for( char ch : carr) {
			System.out.println(ch);
		}
		
		String s6 = "JAVA";
		System.out.println(s6.toLowerCase());
		
		System.out.println(s6);		//internally invokes toString() method
		System.out.println(s6.toString());
		
		String uCase = s5.toUpperCase();
		System.out.println(uCase);
		System.out.println(s5);
		
		String s7 = "\tjava";
		System.out.println(s7.length());
		System.out.println(s7.trim().length());
		
		String s = "\t abc \n";
		System.out.println(s.trim());
		System.out.println(s.strip());
		
		Character c = '\u2000';
		String ss = c + "abc" +c;
		
		System.out.println(Character.isWhitespace(c));
		
		System.out.println(ss.length());
		System.out.println(ss.trim().length());
		System.out.println(ss.strip().length());
		
		
	}

}
