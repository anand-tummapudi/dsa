package com.datastructures.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {2,4,5,6,7};
		
		int result[] = new int[arr1.length+arr2.length];
		
		int i=0,j=0,k=0;
		
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				result[k] = arr1[i];
				i++;
			}else {
				result[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<arr1.length) {
			result[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			result[k] = arr2[j];
			j++;
			k++;
		}
		
		System.out.println(Arrays.toString(result));
	}

}
