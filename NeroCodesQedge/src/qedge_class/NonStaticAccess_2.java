package qedge_class;

public class NonStaticAccess_2 {
	//Non-static data member with Member function
	public class Exam {
		public static void main(String[] args) {
			NonStaticAcess_1 s1= new NonStaticAcess_1();
			s1.sid =111;
			s1.sname = "jack";
			s1.course = "java";
			
			System.out.println("sid is "+ s1.sid);
			System.out.println("sname is "+ s1.sname);
			System.out.println("course is "+s1.course);
			
			s1.read();
			s1.write();
			
			
			//////
			
			String st1 = new String("Hello");
			st1.charAt(0);
			st1.isBlank();
			st1.isEmpty();
			st1.toUpperCase();
		}
		
	}

}
