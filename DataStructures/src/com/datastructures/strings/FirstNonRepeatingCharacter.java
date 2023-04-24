package com.datastructures.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "racecars";
		
		int index = nonReoeatingChar(str);
		
		System.out.println("Non Repeating Character:"+str.charAt(index));

	}

	private static int nonReoeatingChar(String str) {
		int index = -1;
		//int i = 0;
		char []charArr = str.toCharArray();
		Map<Character,Integer> charMap =  new HashMap<>();
		for(int i=0;i<charArr.length;i++) {
			charMap.put(charArr[i],charMap.getOrDefault(charArr[i], 0)+1);
		}
		
		for(int i=0;i<charArr.length;i++) {
			char ch = charArr[i];
			if(charMap.get(ch)==1) return i;
		}
		
		return index;
	}

}
