package projects;
public class Exam{
	public static void main(String[] args) {
		int lol = Exam.add(3, 5);
		System.out.println("result is "+lol);
	}
	public static int add(int a , int b) {
		int res = a + b;
		return res;
	}
}