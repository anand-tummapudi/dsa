package com.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {8,2,1,3,4,2,5,9};
		
		arr = selectionSort(arr);
		
		System.out.println("Sorted Arr:"+Arrays.toString(arr));

	}

	private static int[] selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min])
					min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}

}
