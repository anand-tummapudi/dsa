package com.datastructures.strings;

public class LongestPalindrome {
	public static void main(String[] args) {
		String str = "abcbaabab";
		String sol = longestPalindrome(str);
		
		System.out.println("Longest Palindrome:"+sol);
	}

	private static String longestPalindrome(String str) {
			StringBuffer sb = new StringBuffer();
			for(int i = 0;i<str.length();i++) {
				for(int j=i;j<str.length();j++) {
					
				}
			}
		return sb.toString();
	}

}
