package com.datastructures.arrays;

import java.util.Arrays;

public class MeanTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []array1 = {2,3,4,6};
		int []array2 = {3,5,7};
		int []mergedArray = new int[array1.length+array2.length];
		
		int i=0,j=0,k=0;
		
		while(i<array1.length && j<array2.length) {
			if(array1[i]<=array2[j]) {
				mergedArray[k++] = array1[i++];
			}else {
				mergedArray[k++] = array2[j++];
			}
		}
		
		while(i<array1.length) {
			mergedArray[k++] = array1[i++];
		}
		while(j<array2.length) {
			mergedArray[k++] = array2[j++];
		}
		
		Arrays.toString(mergedArray);
		
		int mean = 0;
		if(mergedArray.length%2==0) {
			mean = (mergedArray[mergedArray.length/2]+mergedArray[mergedArray.length/2-1])/2; 
		}else {
			mean = mergedArray[mergedArray.length/2]/2; 
		}
		
		System.out.println("Mean Value:"+mean);

	}

}
