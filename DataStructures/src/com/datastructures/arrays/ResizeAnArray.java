package com.datastructures.arrays;

import java.util.Arrays;

public class ResizeAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,5,6,1};
		int capacity = arr.length*2;
		System.out.println("Array Original:"+Arrays.toString(arr));
		arr = resizeArray(arr,capacity);
		
		System.out.println("Array After Resize:"+Arrays.toString(arr));
	}

	private static int[] resizeArray(int[] arr, int capacity) {
		// TODO Auto-generated method stub
		int []temp = new int[capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i] = arr[i];
		}
		return temp;
	}

}
