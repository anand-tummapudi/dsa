package com.datastructures.strings;

import java.util.Stack;

public class ReverseStringStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Sample";
		System.out.println("String:"+s);
		s = reverSerString(s);
		
		System.out.println("Reverse:"+s);

	}

	private static String reverSerString(String s) {
		// TODO Auto-generated method stub
		
		Stack<Character> stack = new Stack<>();
		char []charArr = s.toCharArray();
		for(char c:charArr) {
			stack.push(c);
		}
		
		for(int i=0;i<s.length();i++) {
			charArr[i] = stack.pop();
		}

		return new String(charArr);
	}

}
