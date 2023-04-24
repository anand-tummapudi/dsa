package com.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,1,3,5,3,9,7,10};
		
		arr = mergeSort(arr);
		
		System.out.println("Sorted Array:"+Arrays.toString(arr));
		

	}

	private static int[] mergeSort(int[] arr) {
		int low =0;
		int high = arr.length;
		int mid = (low+high)/2;
		int []temp = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i] = arr[i];
		}
		int i = low; int j = mid+1; int k = low;
		
		while(i<=mid&&j<=high) {
			if(temp[i]<=temp[j]) {
				arr[k] = temp[i];
				i++;
			}else {
				arr[k] = temp[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid) {
			arr[k]= temp[i];
			i++;k++;
		}
		
		return arr;
	}

}
