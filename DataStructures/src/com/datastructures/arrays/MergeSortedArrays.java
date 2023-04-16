package com.datastructures.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1,2,3,0,0,0};
		int arr2[] = {2,5,6};
		int m= arr1.length;
		int n = arr2.length;
		//Arrays.sort(arr1);
		//Arrays.sort(arr2);
		
		mergeArrays(arr1,arr2,m,n);

	}

	private static void mergeArrays(int[] arr1, int[] arr2,int m,int n) {
		int i=m-1; 
        int j=n-1; 
        int k=arr1.length-1; 

        while(j>=0){
            if(i>=0 && arr1[i]>arr2[j]){
            	arr1[k]=arr1[i];
                k--; 
                i--; 
            } else{
            	arr1[k] = arr2[j];
                k--; 
                j--; 
            }
        }
		
        System.out.println(Arrays.toString(arr1));
	}

}
