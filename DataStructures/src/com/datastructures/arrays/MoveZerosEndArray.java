package com.datastructures.arrays;

import java.util.Arrays;

public class MoveZerosEndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,0,2,3,4,0,2,0,5,6,0};
		
		moveZeros(arr);
	}

	private static void moveZeros(int[] arr) {
			
		for(int i=0,j=0;i<arr.length;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j]!=0) {
				j++;
			}
	
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
