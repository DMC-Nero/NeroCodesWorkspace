package org.dsa;

public class V35_StringPalindrome {

	public static void main(String[] args) {
		String str = "amadama";
		System.out.println(palindrome(str));
	}

	public static boolean palindrome(String str) {
		int n = str.length();
		if (n < 0) {
			return false;
		}
		String res = "";
		if (n > 0) {
			for (int i = n - 1; i >= 0; i--) {
				res = res + str.charAt(i);
			}
		}
		if (res.equals(str)) {
			return true;
		} else {

			return false;
		}
	}

}
