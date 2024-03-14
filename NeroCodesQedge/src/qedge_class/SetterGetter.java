package qedge_class;

public class SetterGetter {
	public static void main(String[] args) {
		Setget s1 = new Setget();
		s1.setSid(111);
		System.out.println(s1.getSid());
		s1.setSname("Nero");
		System.out.println(s1.getSname());
		s1.setResult(true);
		System.out.println(s1.isResult());
	}
}

class Setget {
	private int sid;
	private String sname;
	private boolean result;

	public void setSid(int id) {
		sid = id;
	}

	public int getSid() {
		return sid;
	}

	public void setSname(String name) {
		sname = name;
	}

	public String getSname() {
		return sname;
	}

	public void setResult(boolean res) {
		result = res;
	}

	public boolean isResult() {
		return result;
	}
}
