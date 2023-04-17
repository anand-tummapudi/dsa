package com.datastructures.arrays;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,1,5,6,7,8,9};
		int missingNumber = findMissing(arr);
		
		System.out.println("Missing Number:"+missingNumber);

	}

	private static int findMissing(int[] arr) {
			int n = arr.length+1;
			
			int sum = n*(n+1)/2;
			
			int sumArr = Arrays.stream(arr).sum();
			System.out.println("Array Sum:"+sumArr);
			
			for(int i=0;i<arr.length;i++) {
				sum = sum - arr[i];
			}
			
		return sum;
	}

}
