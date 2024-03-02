package projects;
//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
public class Exam{
	public static void main(String[] args) {
		double s=Exam.areaCircle(5);
		System.out.println("area of circle is "+ s);
		
		int a=Exam.areaRect(5, 7);
		System.out.println("area of rectangle is "+a);
	
	}
	public static double areaCircle(double r) {
		double area=3.14 *r*r;
		return area;
	}
	public static int areaRect(int a,int b) {
		int area=a*b;
		return area;
	}
}