package com.datastructures.arrays;

import java.util.Arrays;

// Program to reaarange the elements in an Array MaxMin Order
public class ReArrangeElements {

	public static void main(String[] args) {
		
		int []arr = {2,7,5,6,8,3,4,10};
		
		reArrange(arr);
			
	}
	
	public static void reArrange(int []arr) {
		
		int maxIndex = arr.length-1;
		int minIndex = 0;
		
		Arrays.sort(arr);
		
		System.out.println("Sorted Array:"+Arrays.toString(arr));
		
		int max = arr[maxIndex]+1;
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				arr[i] = arr[i] + (arr[maxIndex]%max)*max;
				maxIndex--;
			}else {
				arr[i] = arr[i] + (arr[minIndex]%max)*max;
				minIndex++;
			}
		}
		
		System.out.println("InterMediateArraay:"+Arrays.toString(arr));
		
		for (int i = 0;i<arr.length;i++) {
			arr[i] = arr[i]/max;
		}
		
		System.out.println("Result:"+Arrays.toString(arr));
		
	}

}
