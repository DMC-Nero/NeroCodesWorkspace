package org.array;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "amadama";
		System.out.println(palindrome(str));

	}

	public static boolean palindrome(String str) {
		char[] value = str.toCharArray();
		int i = 0;
		int j = value.length - 1;
		while (i < j) {
			if (value[i] != value[j]) {
				return false;
			}
			i++;
			j--;

		}

		return true;

	}

}
