package com.algorithms;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {2,4,5,7,9,10};
		int arr2[] = {1,3,5,7,8,10};
		
		System.out.println("Array1:"+Arrays.toString(arr1));
		System.out.println("Array2:"+Arrays.toString(arr2));
		
		int []result = mergeArrays(arr1,arr2);
		
		System.out.println("Result Array:"+Arrays.toString(result));

	}

	private static int[] mergeArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		int resultArr[] = new int[arr1.length + arr2.length];
		
		int k=0,i=0,j=0;
		
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				resultArr[k] = arr1[i];
				i++;
			}else {
				resultArr[k] = arr2[j];
				j++;
			}
			
			k++;
		}
		
		while(i<arr1.length) {
			resultArr[k] = arr1[i];
			i++;k++;
		}
		while(j<arr1.length) {
			resultArr[k] = arr1[j];
			j++;k++;
		}
		return resultArr;
	}

}
