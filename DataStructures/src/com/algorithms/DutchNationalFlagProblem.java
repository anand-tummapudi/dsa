package com.algorithms;

import java.util.Arrays;

public class DutchNationalFlagProblem {

	public static void main(String[] args) {

		int arr[] = {2,1,0,1,0,2,1,0};
		
		arr = sortArray(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	private static int[] sortArray(int[] arr) {
		int i=0;
		int j=0;
		int k= arr.length-1;
		
		while(i<=k) {
			if(arr[i]==0) {
				swap(arr,i,j);
				i++;
				j++;
			}
			else if(arr[i]==1) {
				i++;
			}else if(arr[i]==2) {
				swap(arr,i,k);
				k--;
			}
		}
		
	return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
