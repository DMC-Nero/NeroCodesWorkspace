package org.leet.easy;

public class Q1_TwoSum {

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int target = 18;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] < target) {
				for (int j = i + 1; j <= nums.length - 1; j++) {
					if (nums[i] + nums[j] == target) {
						System.out.println("[" + i + " , " + j + "]");
					}
				}
			}
		}
	}

}

/*
 * 
 * class Solution {
 * 		public int[] twoSum(int[] nums, int target) { 
 * 			String s1;
 * 			for(int i = 0; i <= nums.length-1; i++) { 
 * 				for(int j = i+1;j<=nums.length-1;j++) { 
 * 					if(nums[i]+nums[j]==target) { 
 * 						return new int[]{i,j};
 * 					}
 * 				} 
 * 			} 
 * 		return new int[]{}; 
 *	}
 * 
 */