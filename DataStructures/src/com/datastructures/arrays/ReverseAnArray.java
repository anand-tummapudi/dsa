package com.datastructures.arrays;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,3,4,5,6,7,8};
		
		int []result = reverseArray(arr);
		
		System.out.println("Reverse:"+Arrays.toString(result));
	}

	private static int[] reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
}
