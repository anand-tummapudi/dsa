package com.algorithms;

/**
 * Given a sorted array, find the insert position of given element if
 * the element is not found in the array, return the element if the element is found
 * 
 * **/
public class FindInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,3,5,7,9};
		int key = 8;
		
		int pos = findInsertPosition(arr,key);
		
		System.out.println("Element Insert Position:"+pos);

	}

	private static int findInsertPosition(int[] arr, int key) {
		
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (high+low)/2;
			
			if(arr[mid]==key) {
				return mid;
			}
			
			if(key<arr[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}

		return low;
	}

}
