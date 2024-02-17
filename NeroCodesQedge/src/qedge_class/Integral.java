package qedge_class;

public class Integral {
	public static void main(String[] args) {
		int x=155; //155 is integral literal , int type , decimal NS
		System.out.println(x);
		int y=0B010101;
		System.out.println(y);
		int z=01012;
		System.out.println(z);
		int a=0X12abc;
		System.out.println(a);
		
		System.out.println("=====binary=====");
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(z));
		System.out.println(Integer.toBinaryString(a));
		
		System.out.println("=====octal=====");
		System.out.println(Integer.toOctalString(x));
		System.out.println(Integer.toOctalString(y));
		System.out.println(Integer.toOctalString(z));
		System.out.println(Integer.toOctalString(a));
		
		System.out.println("=====Hexa=====");
		System.out.println(Integer.toHexString(x));
		System.out.println(Integer.toHexString(y));
		System.out.println(Integer.toHexString(z));
		System.out.println(Integer.toHexString(a));
		// 255L ->Integral Literal of long type,written in Decimal NS
		//0B111L ->Integral Literal of long type , written in binary NS
		//0225 -> Integral Literal of long type ,written in octal NS
		//0X225L -> Integral Literal of long type , written in hexa NS
	}

}
