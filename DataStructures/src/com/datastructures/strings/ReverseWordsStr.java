package com.datastructures.strings;

public class ReverseWordsStr {

	public static void main(String[] args) {
		
		String str= "the sky is blue";
		System.out.println(str.length());
		String strArr[] = str.split(" ");
		
		reverseWords(strArr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=strArr.length-1;i>=0;i--) {
			if(strArr[i].trim().length()>0) {
				sb.append(strArr[i]);
				sb.append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}
	
	private static void reverseWords(String []charArr){
		int start = 0;
		int end = charArr.length-1;
		
		String temp;
		
		while(start<end) {
			temp = charArr[start];
			charArr[start] = charArr[end];
			charArr[end] = temp;
			start++;
			end --;
		}
		String resultStr = "";
		for(String str:charArr) {
			resultStr=resultStr+str;
		}
		
		System.out.println("Reverse String:"+resultStr);
		
	}

}
