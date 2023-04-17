package com.datastructures.arrays;

import java.util.Arrays;

public class FindMinimumValueinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {15,8,3,5,7,8,9,10,6};
		
		int min = findMin(arr);
		System.out.println("Minimum Value:"+min);
		
		findMinMax(arr);

	}

	private static void findMinMax(int[] arr) {
		
		int min = Arrays.stream(arr).min().getAsInt();
		
		System.out.println("Minimum Value:"+min);
		
		int max = Arrays.stream(arr).max().getAsInt();
		
		System.out.println("Maximum Value:"+max);
	}

	private static int findMin(int[] arr) {
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

}
