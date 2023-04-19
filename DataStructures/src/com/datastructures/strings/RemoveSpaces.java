package com.datastructures.strings;

import java.util.StringTokenizer;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hi How Are You";
		s = removeSpaces(s);
		
		System.out.println(s);
	}

	private static String removeSpaces(String s) {
		// TODO Auto-generated method stub
		if(s==null)
			return s;
		StringTokenizer st = new StringTokenizer(s," ");
		StringBuffer sb = new StringBuffer();
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		
		return sb.toString();
	}

}
