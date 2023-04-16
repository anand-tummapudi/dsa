package com.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hi Hello how are you hi Hello";
		
		printDuplicates(s);

	}

	private static void printDuplicates(String s) {
		String []arrayStr = s.split(" ");
		System.out.println(Arrays.toString(arrayStr));
		Map<String,Integer> strMap = new HashMap<>();
		
		for (String string : arrayStr) {
				if(strMap.get(string)!=null && strMap.get(string)>0) {
					strMap.put(string, strMap.get(string)+1);
				}else {
					strMap.put(string, 1);
				}
		}
		
		System.out.println(strMap.entrySet());
		
	}

}
