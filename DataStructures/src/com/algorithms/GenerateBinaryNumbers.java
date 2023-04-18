package com.algorithms;

import java.util.ArrayList;

public class GenerateBinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		ArrayList<String> result= new ArrayList<>();
		
		result = generateBinary(n);
		
		System.out.println(result);
	}

	private static ArrayList<String> generateBinary(int n) {
		ArrayList<String> al = new ArrayList<>();
			for(int i=1;i<=n;i++) {
				//String s = getBinary(i);
				al.add(Integer.toBinaryString(i));
			}
		return al;
	}

	private static String getBinary(int i) {
		// TODO Auto-generated method stub
		String s = null;
			if(i%2==1) {
				
			}
		return s;
	}

}
