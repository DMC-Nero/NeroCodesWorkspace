package projects;

public class Exam {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		System.out.println(s1);
		s1.fun1();
	}
}

class Sample{
	public void fun1() {
		System.out.println("fun() invoked");
		System.out.println(this);
	}
}