package com.datastructures.strings;

public class SubSequenceProblem {
	
	public static void main(String []args) {
		
		String str = "abcde";
		String seq = "ade";
		
		boolean b = validateSubSequence(str,seq);
		
		if(b) {
			System.out.println("Valid SubSequence");
		}else {
			System.out.println("Invalid Sub Sequence");
		}
		
	}

	private static boolean validateSubSequence(String str, String seq) {
		int i=0,j=0;
		
		while(i<str.length()&&j<seq.length()) {
			if(str.charAt(i)==seq.charAt(j)) {
				j++;
			}
			i++;
		}
		return seq.length()==j;
	}
}
