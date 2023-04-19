package com.algorithms;

public class FibanossiSeries {
	static int n1 = 0;
	static int n2 = 1;
	static int n3 = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.print(n1+" "+n2);
		fibanossi(n);

	}

	private static void fibanossi(int n) {
		if(n>0){
			n3 = n1+n2;
			
			System.out.print(" "+n3);
			
			n1 = n2;
			n2 = n3;
			fibanossi(n-1);
		}// TODO Auto-generated method stub
		
	}

}
