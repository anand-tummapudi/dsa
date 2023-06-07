package com.datastructures.strings;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String s = "A man, a plan, a canal: Panama"; s = s.replaceAll("[^a-zA-Z0-9]",
		 * ""); System.out.println(s.trim().toLowerCase());
		 */		
		String s = "A man, a plan, a canal: Panama";
		
		boolean result = checkPalindrom(s);
		
		if(result) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not a Palindrom");
		}

	}

	private static boolean checkPalindrom(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.replaceAll("\\s","");
        s = s.toLowerCase();
        
        System.out.println(s);

        if(s.trim().equals("")){
            return true;
        }
        char charArr[] = s.toCharArray();
    int i = 0;
    int j = charArr.length-1;
       while(i<j){
           if(charArr[i]!=charArr[j]){
               return false;
           }
           i++;
           j--;
       } 
       return true;
	}

}
