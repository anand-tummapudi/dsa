package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,2,3,4,1};
		
		/*
		 * ArrayList<Integer> al = new ArrayList<>();
		 * 
		 * for(int i=0;i<arr.length;i++) { if(al.contains(arr[i])) {
		 * System.out.println("Duplicate"+arr[i]); }else { al.add(arr[i]); } }
		 */
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.println("Duplicate:"+arr[i]);
			}
		}

	}

}
