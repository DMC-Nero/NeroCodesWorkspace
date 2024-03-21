package qedge_class;

public class StringConstuctor {

	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1);
		
		byte[] barr = new byte[] {65,66,67,68,69,70};
		String s2 = new String(barr);		//ABCDEF
		System.out.println(s2);
		
		String s3 = new String(barr, 2,4);  //CDEF
		System.out.println(s3);
		
		char[] carr = new char[] {'j','a','v','a','w','o','r','l','d'};
		String s4 = new String(carr);
		System.out.println(s4);
		
		String s5 = new String(carr,4,5);
		System.out.println(s5);
		
		String s6 = new String(s5);
		System.out.println(s6);
		
		StringBuffer sb1 = new StringBuffer("spring");
		String s7 = new String(sb1);
		System.out.println(s7);
		
		StringBuilder sb2 = new StringBuilder("Hiberanet");
		String s8 = new String(sb2);
		System.out.println(s8);
	}

}
