package qedge_class;

public class Var_args {

	public static void main(String[] args) {
		add(2,3);
		add(2,3,4);
		
		int res = add( new int[] {1,2,3,4,5,6});
		System.out.println(res);
		
		int res2 = add( new int[] {1,2,3,4,5,6,7,8,9} );
		System.out.println(res2);
		
		int res3 = add( 1,2,3,4,5,6,7);
		System.out.println(res3);
		
		
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a, int b,int c) {
		return a+b+c;
	}
	/*
	 * public static  int add( int[] nums ) {
	 * 	int sum = 0;
	 * 	for( int num : nums ) {
	 *  	sum += num;
	 *  	}
	 *  return sum;
	 *  }
	 */
	public static int add(int... nums) {
		System.out.println("add with var-arg");
		int sum = 0;
		for( int num : nums) {
			sum += num;
		}
		return sum;
	}

}
