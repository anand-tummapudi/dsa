package com.datastructures.arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long now = System.currentTimeMillis();
		int []arr = {8,2,7,9,3,5,1,6,4};
		System.out.println("Before Sorting"+Arrays.toString(arr));
		sortArray(arr);
		System.out.println("Time taken:"+(System.currentTimeMillis()-now)+" MS");

	}

	private static void sortArray(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				i=-1;
			}
		}
		
		System.out.println("Sorted:"+Arrays.toString(arr));
		
	}

}
