package com.algorithms;

public class PalindromNumber {
	
	public static void main(String []args) {
		int num = 555;
		int sol = palindromCheck(num);
		if(sol==num) {
			System.out.println("Pallindrom");
		}else {
			System.out.println("NOt a Pallinrom");
		}
		
	}

	private static int palindromCheck(int num) {
		int sol = 0;
		while(num>0) {
			int rem = num%10;
			sol = sol*10+rem;
			num = num/10;
		} 
		
		System.out.println("Num:"+num+"Sol:"+sol);
		
		return sol;
	}
	

}
