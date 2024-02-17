package qedge_class_examples;

public class Swapping_Without_Temp {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the value of a ");
//		int a=sc.nextInt();  //10
//		System.out.println("enter the value of b ");
//			int b=sc.nextInt();	//5
//			a=a*b;    	//a=>50
//			b=a/b;		// b=50/5  =>10
//			a=a/b;		// a=50/10 =>5
//			System.out.println("the value of a and b after swapping  " + "a = " +a + "    b = " +b );
		
		
		
//		int x=10;
//		int y=5;
//		x=x+y;			//x=10+5  =>15
//		y=x-y;			//y=15-5  =>10
//		x=x-y;			//x=15-10 =>5
//		System.out.println("x => "+x);
//		System.out.println("y => "+y);
		
		
		
		int x=10;       //1010
		int y=5;		//0101
		x=x^y;			//1111	=>15
					//y=> 0101  =>5
		y=x^y;			//1010  =>10
					//x=> 1111  =>15
		x=x^y;			//0101  =>5
		System.out.println("x =>  "+x);
		System.out.println("y =>  "+y);
		
	}


}
