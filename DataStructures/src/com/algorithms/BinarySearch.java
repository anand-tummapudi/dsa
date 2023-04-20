package com.algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,2,3,4,5,6,7,8};
		int key = 6;
		
		binarySearch(arr,key);
	}

	private static void binarySearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				System.out.println("Element Found ....@:"+mid);
			}
			if(key<arr[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
	}

}
