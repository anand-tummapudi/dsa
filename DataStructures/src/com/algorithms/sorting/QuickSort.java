package com.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {0,6,-2,-5,6,3,8,7,9,10};
		
		int low = 0;
		int high = arr.length-1;
		
		arr = sort (arr,low,high);
		
		System.out.println("Sorted Array:"+Arrays.toString(arr));

	}

	private static int[] sort(int[] arr, int low, int high) {
		if(low<high) {
			int p = partition(arr,low,high);
			sort(arr,low,p-1);
			sort(arr,p+1,high);
		}
		
		
		return arr;
	}

	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = arr[high];
		
		int i = low;
		int j= low;
		while(i<=high) {
			if(arr[i]<=pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			
			i++;
		}
		
		return j-1;
	}

}
