package com.algorithms.sorting;

import java.util.Arrays;

// Sort the given array of elements using Bubblesort method 
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,1,4,3,6,8,5,7};
		
		arr = bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));

	}

	private static int[] bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		boolean isSwapped;
		for(int i=0;i<arr.length-1;i++) {
			isSwapped = false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			
			if(!isSwapped) break;
		}
		return arr;
	}

}
