package com.datastructures.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcd";
		
		int length = longestSubstrLength(str);
		System.out.println("Longest Substring Length:"+length);
	}

	private static int longestSubstrLength(String str) {
		int maxLength = 0;	
		for(int i=0;i<str.length();i++) {
			Set<Character> strSet = new HashSet<>();
				for(int j=i;j<str.length();j++) {
					if(strSet.contains(str.charAt(j))) {
						break;
					}
					strSet.add(str.charAt(j));
					maxLength = Math.max(maxLength, strSet.size());
				}
			}
		return maxLength;
	}

}
