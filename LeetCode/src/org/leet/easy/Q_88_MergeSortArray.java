package org.leet.easy;

public class Q_88_MergeSortArray {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		merge(nums1,nums2,3,3);
		for(int x : nums1) {
			System.out.println(x);
		}
	}

	public static void merge(int[] nums1, int[] nums2, int n, int m) {
		int i = n - 1;
		int j = m - 1;
		int k = (n + m) - 1;
		if(n == 0 ) return;
		
		while (j >= 0 && i >= 0)  {
			if (nums1[i] > nums2[j] ) {
				nums1[k] = nums1[i];
				k--;
				i--;
			}else {
				nums1[k] = nums2[j];
				k--;
				j--;
			}
			while(j > 0 ) {
				nums1[k] = nums2[j];
				j--;
				k--;
			}
			
		}
	}

}
