package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {-1,0,-1,2,1,1};
		int target = 0;
		
		Set<ArrayList<Integer>> result = getThreeSum(arr, target);
		
		System.out.println("Result:"+result);

	}
	
	public static Set<ArrayList<Integer>> getThreeSum(int []arr,int target){
		
		Set<ArrayList<Integer>> result = new HashSet<>();
		ArrayList<Integer> al = null;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-2;i++) {
			int j=i+1;
			int k = arr.length-1;
			while(j<k) {
				int sum = arr[i]+arr[j]+arr[k];
				
				if(sum==target) {
					al = new ArrayList<>();
					al.add(arr[i]);
					al.add(arr[j]);
					al.add(arr[k]);
					j++;
					k--;
					result.add(al);
				}else if(sum<target) {
					j++;
				}else {
					k--;
				}
			}
		}
		
	return result;
	}

}
