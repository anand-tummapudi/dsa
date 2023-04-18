package com.datastructures.arrays;

import java.util.Arrays;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {2,4,1,3,5};
		
		arr = nextGreaterEle(arr);
		
		System.out.println(Arrays.toString(arr));

	}

	private static int[] nextGreaterEle(int[] arr) {
		// TODO Auto-generated method stub
		int []result = new int[arr.length];
			
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]>arr[i]) {
						result[i] = arr[j];
						break;
					}
				}
			}
		return result;
	}

}
