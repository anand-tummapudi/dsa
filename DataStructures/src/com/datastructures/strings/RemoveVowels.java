package com.datastructures.strings;

import java.util.Set;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "result";
		
		String result = removeVowels(s);
		
		System.out.println("Result:"+result);
	}

	private static String removeVowels(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Set<Character> vowels = Set.of('a','e','i','o','u');
		char []charArray = s.toCharArray();
		for(Character ch:charArray) {
			if(!vowels.contains(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
