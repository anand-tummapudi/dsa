package com.algorithms.sorting;

import java.util.Arrays;

public class SquarerootsofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {-4,-1,0,3,5,8};
		System.out.println("Array before sorting:"+Arrays.toString(arr));		
		arr = sortArray(arr);
		System.out.println("Sorted Array:"+Arrays.toString(arr));

	}

	private static int[] sortArray(int[] arr) {
		int n = arr.length;
		int i=0;
		int j = n-1;
		
		int []result = new int[n];
		
		for(int k=n-1;k>=0;k--) {
			if(Math.abs(arr[i])>Math.abs(arr[j])) {
				result[k] = arr[i]*arr[i];
				i++;
			}else {
				result[k] = arr[j]*arr[j];
				j--;
			}
		}
		
		return result;
	}

}
