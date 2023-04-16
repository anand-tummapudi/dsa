package com.algorithms;

public class BinaryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []binaryArray = {1,0,0,1,1,1,0,0,0,1,0,1,1,0};
		int []queries = {0,1,2,3,6};
		
		findPairs(binaryArray,queries);

	}

	private static void findPairs(int[] binaryArray, int[] queries) {
		
		for(int i=0;i<queries.length;i++) {
			getCounts(binaryArray,queries[i]);
		}
		
	}

	private static void getCounts(int[] binaryArray, int index) {
		int zeroCount=0;
		int oneCount = 0;
		for(int i=0;i<index;i++) {
			if(binaryArray[i]>0) {
				oneCount++;
			}else {
				zeroCount++;
			}
		}
		
		System.out.println(index+" - Counts-"+zeroCount+"-Zeros-"+oneCount+"-Ones");
		
		
	}

}
