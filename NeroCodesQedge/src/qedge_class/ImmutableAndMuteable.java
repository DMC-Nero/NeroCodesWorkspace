package qedge_class;

public class ImmutableAndMuteable {

	public static void main(String[] args) {
		ImmStudent s1 = new ImmStudent(999,"Nero");
		s1.StudentInfo();
		
		// s1.sid = 222;		//invalid
		// s1.sname = "java";	//invalid
		// s1.StudentInfo();
		
		}

}
class ImmStudent{
	final int sid;
	final String sname;
	
	public ImmStudent(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;
	}
	
	public void StudentInfo() {
		System.out.println("sid - "+ sid+ " sname - "+ sname);
	}
}
