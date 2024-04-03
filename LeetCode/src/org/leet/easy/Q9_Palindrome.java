package org.leet.easy;

public class Q9_Palindrome {

	public static void main(String[] args) {
		int x = 12121;
		int num = x;
		String sum = "";
		String len = Integer.toString(x);
		for(int i=0;i<len.length();i++) {
			int rem = x % 10;
			sum = sum + rem;
			x = x/10;
		}
		int res = Integer.valueOf(sum);
		
		if(res == num) {
			System.out.println("its a palindrome number");
		}else {
			System.out.println("its not a palindrome number");
		}

	}

}



