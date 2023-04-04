package com.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] getTwoSum(int arr[], int target) {
		
		for(int i=0;i<arr.length;i++) {

			int complement = target - arr[i];

			for(int j=i+1;j<arr.length;j++) {
				if(complement == arr[j]) {
					return new int[] {i,j};
				}
			}
			
			//throw new IllegalArgumentException("No Match Found");
		}
		
		return null;
	}
	
	public static int[] getTwoSumMap(int arr[], int target) {
		
		Map<Integer,Integer> result_map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			int complement = target - arr[i];
			
			if(result_map.containsKey(complement)) {
				return new int[] {result_map.get(complement),i};
			}
			
			result_map.put(arr[i], i);
		}
		
	return null;
	}
	
	public static void main(String args[]) {
		int[]arr = getTwoSum(new int[]{2, 1,3,4,5},8);
		
		System.out.println(Arrays.toString(arr));
	}
}
