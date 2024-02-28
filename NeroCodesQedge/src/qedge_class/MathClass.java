package qedge_class;

public class MathClass {

	public static void main(String[] args) {
		System.out.println("E value is "+ Math.E);
		System.out.println("Pi value is "+ Math.PI);
		System.out.println("TAU value is "+ Math.TAU);
		
		int r=2;
		double area = Math.PI *r*r;
		
		int absValue = Math.abs(-10);
		System.out.println(absValue);
		
//		int addExact = Math.addExact(2147483645, 3);
//		System.out.println(addExact);/
		
		int x = 2147483645;
		int y = 3;
		int res=x+y;
		System.out.println(res);
		
		double pow = Math.pow(2, 3);
		System.out.println(pow);
		
		
		System.out.println(Math.random());
		System.out.println(Math.round(2.4));
	}

}
