package com.datastructures.strings;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello";
		
		boolean result = checkPalindrom(s.toLowerCase());
		
		if(result) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not a Palindrom");
		}

	}

	private static boolean checkPalindrom(String s) {
		char charArr[] = s.toCharArray();
		int start = 0;
		int end = charArr.length-1;
		while(start<end) {
			if(charArr[start]!=charArr[end])
				return false;
			start++;
			end--;
		}
		return true;
	}

}
