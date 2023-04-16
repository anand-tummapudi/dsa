package com.algorithms;

import java.util.HashMap;
import java.util.Map;

public class ValidateAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "anagram";
		String s2 = "Sample";
		
		boolean result = validateAnagram(s1,s2);
		
		if(result) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}

	}

	private static boolean validateAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		
		char []c1 = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Map<Character,Integer> charMap = new HashMap<>();
			for(char c:c1) {
				if(charMap.get(c)!=null&&charMap.get(c)>0) {
					charMap.put(c, charMap.get(c)+1);
				}else {
					charMap.put(c, 1);
				}
			}
			
			for(char c:c2) {
				if(charMap.get(c)!=null && charMap.get(c)>1) {
					charMap.put(c, charMap.get(c)-1);
				}else {
					charMap.remove(c);
				}
			}
			
			if(charMap.size()==0)
				return true;
		return false;
	}

}
