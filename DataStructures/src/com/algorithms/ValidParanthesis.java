package com.algorithms;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "{([])}";
		
		boolean result = isValidParan(s);
		if(result) {
			System.out.println("Valid Paranthesis");
		}else {
			System.out.println("Not Valid");
		}
	}

	private static boolean isValidParan(String s) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		
		if(!(s.length()%2==0)) return false;
		
		for(char c:s.toCharArray()) {
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}else {
				if(stack.isEmpty()) {
					return false;
				}else {
					char top = stack.peek();
					if(c==')' && top=='(' || c=='}' && top=='{' || c==']' && top=='[') {
						stack.pop();
					}else {
						return false;
					}
				}
			}
		}
		
		return true;
	}

}
