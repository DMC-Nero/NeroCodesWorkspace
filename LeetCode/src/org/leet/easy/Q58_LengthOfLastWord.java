package org.leet.easy;

public class Q58_LengthOfLastWord {

	public static void main(String[] args) {
		
		System.out.println(lengthOfLast("hello world"));
	}
	public static int lengthOfLast(String s) {
		
		s = s.trim();
		int count = 0;
		for(int i=s.length()-1 ; i>0 ; i--) {
			if(s.charAt(i) !=  ' ') {
				count = count +1;
			}else {
				break;
			}
		}
		
		return count;
	}
}
