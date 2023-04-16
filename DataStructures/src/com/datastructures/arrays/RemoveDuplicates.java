package com.datastructures.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,2,4,6,7,8,3,1,4,5,8,3,2,};
		
		removeDuplicates(arr);

	}

	private static void removeDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		System.out.println("Sorted Array:"+Arrays.toString(arr));
		System.out.println("Array length before removing duplicates:"+arr.length);
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-1 && arr[i]==arr[i+1]) {
				continue;
			}else {
				arr[count++] = arr[i];
			}
		}
		
		System.out.println("Array After removing Duplicates:"+Arrays.toString(arr));
		System.out.println("Array Length:"+arr.length);
		
	}

}
