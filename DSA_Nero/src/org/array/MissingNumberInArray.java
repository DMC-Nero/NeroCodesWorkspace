package org.array;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = {1,5,2,3,6,8,7,};
		System.out.println(missNum(arr));
	}
	
	public static int missNum(int[] arr) {
		int n = arr.length+1;
		int sum = n * (n+1)/2;
		for(int x: arr) {
			sum = sum -x;
		}
		
		return sum;
	}

}
