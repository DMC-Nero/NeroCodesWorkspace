package qedge_class;

public class StringClassMethods2 {

	public static void main(String[] args) {
		String fileName = "c:\\Nero-workspace\\Codes.java";
		
		boolean endsWith = fileName.endsWith(".java");
		System.out.println(endsWith);
		
		String s1 = "hello";
		String s2 = "hello";
		boolean contentEquals = s1.equals(s2);	//S
		System.out.println(contentEquals);
		
		String s3 = "HELLO";
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s3);
		System.out.println(equalsIgnoreCase);
		
		String name = "jack";
		int age = 25;
		boolean isSingle = true;
		
		System.out.println("person name si "+ name);
		
		String formatedString = String.format("Person name is %s, age is %d, is Single %b"+name,age,isSingle);
		System.out.println(formatedString);
		
		String s4 = "Persons name is %s, age is %d, is Single %b";
		String resString = s4.format(name,age,isSingle );
		System.out.println(resString);
		
		byte[] barr = new byte[] {65,66,67};
		String s5 = new String(barr);	//converitng a byte[] to Stirng
		
		byte[] bytes = s5.getBytes();
		
		for (byte b:bytes) {
			System.out.println(b);
		}
		
		String s6 = "helloworls";
		char[] dest = new char[5];
		s6.getChars(0, 5, dest, 0);
		
		for (char ch : dest) {
			System.out.println(ch);
		}
		
		int hashCode = s6.hashCode();	
		
		System.out.println(hashCode);
		
		//Multiline String [ Java 9	]
		String m1String = """
				Java is
				Awesom""";
		System.out.println(m1String);
		
		System.out.println(m1String.indent(5));
		
		String s1String = "helloworls";
		System.out.println(s1String);
		
		System.out.println(s1String.indent(5));
		
		//s6 => "helloworld"
		System.out.println(s6.indexOf('o'));
		System.out.println(s6.indexOf('l',5));
		
		System.out.println(s6.lastIndexOf('o'));
		
		String s7 = "";
		System.out.println(s7.indexOf("never"));
		System.out.println(s7.indexOf("never",20));
		
		System.out.println(s7.lastIndexOf("never"));
		
		String s8 = "  ";
		System.out.println(s8.length());
		System.out.println(s8.isBlank());
		System.out.println(s8.isEmpty());
		
		
		
		
		
		
		
		
		
		
	}

}
