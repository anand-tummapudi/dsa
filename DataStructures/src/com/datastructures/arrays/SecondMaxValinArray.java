package com.datastructures.arrays;

public class SecondMaxValinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {90,12,23,22,34,54,45,78,77,89,90};
		
		int secondMax = findSecondMax(arr);
		
		System.out.println("Second Max:"+secondMax);

	}

	private static int findSecondMax(int[] arr) {
		int secondMax = 0;
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax = max;
				max = arr[i];
			}else if(arr[i]>secondMax && arr[i]<max) {
				secondMax = arr[i];
			}
		}
		
	return secondMax;
	}

}
