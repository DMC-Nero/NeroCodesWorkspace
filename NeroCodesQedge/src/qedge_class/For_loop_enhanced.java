package qedge_class;

public class For_loop_enhanced {

	public static void main(String[] args) {
		int[] nums = {10,11,12,13,14 } ;
		
		//using Traditional for loop
		for( int i = 0 ; i< nums.length; i++) {
			System.out.println(nums[i]);	
		}
		System.out.println("==========");
		//using enhanced for loop
		for( int x : nums) {
			System.out.println(x);
		}
	}

}
