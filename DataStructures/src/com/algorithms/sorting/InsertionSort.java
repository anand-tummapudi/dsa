package com.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,5,2,1,7,6};
		arr = insertionSort(arr);
		System.out.println("Sorted Array:"+Arrays.toString(arr));

	}

	private static int[] insertionSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}

}
