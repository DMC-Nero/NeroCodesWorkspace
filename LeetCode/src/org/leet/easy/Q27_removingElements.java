package org.leet.easy;

public class Q27_removingElements {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		
		
		System.out.println(removeElements(nums,val));
		
//
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] != val) {
//				nums[rd] = nums[i];
//				rd++;
//			}
//		}
//		for(int j=0;j<rd;j++) {
//			System.out.println(nums[j]);
//		}
		
	}
		public static int removeElements(int[] nums ,int val) {
			int rd = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] != val) {
					nums[rd] = nums[i];
					rd++;
				}
			}
			return rd;
		}
}