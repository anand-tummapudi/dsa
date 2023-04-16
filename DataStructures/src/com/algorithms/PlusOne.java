package com.algorithms;

import java.util.Arrays;

public class PlusOne {

	//Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {9,9,9,9};
		
		System.out.println(Arrays.toString(arr));
		
		int []result = calculatePlusOne(arr);
		
		System.out.println(Arrays.toString(result));
	}

	private static int[] calculatePlusOne(int[] arr) {
		
		for(int i=arr.length-1;i>0;i--) {
			
			if(arr[i]<9) {
				arr[i]++;
				return arr;
			}
			
			arr[i] = 0;
		}
		
		int []newArr = new int[arr.length+1];
		newArr[0] = 1;
		
		return newArr;
		
	}

}
