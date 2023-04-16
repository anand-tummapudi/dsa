package com.algorithms;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		String arr[] = {"A","E","I","O","U"};
		reverseStringArray(arr);
		String s = "REVERSE";
		reverseString(s);
	}

	private static void reverseString(String s) {
		// TODO Auto-generated method stub
		String temp = "";
		
		for(int i=0;i<s.length();i++) {
			temp = s.charAt(i)+temp;
		}
		
		System.out.println(temp);
	}

	private static void reverseStringArray(String[] arr) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			String temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
