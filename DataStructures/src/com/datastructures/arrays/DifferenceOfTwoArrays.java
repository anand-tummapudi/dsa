package com.datastructures.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DifferenceOfTwoArrays {

	public static void main(String[] args) {
		int[] num1 = {1,2,3,3};
		int[] num2 = {1,1,2,2};
		List<List<Integer>> result = findDifference(num1,num2);  
		
		System.out.println(result);
	}

	private static List<List<Integer>> findDifference(int[] num1, int[] num2) {
		Set<Integer> l1 = new HashSet<>();
		Set<Integer> l2 = new HashSet<>();
		List<List<Integer>> result = new ArrayList<>();
		for(Integer i1:num1) {
			l1.add(i1);
		}
		for(Integer i1:num2) {
			l2.add(i1);
		}
		List<Integer> tempList = new ArrayList<>();
		
		Iterator<Integer> li1 = l1.iterator();
		while(li1.hasNext()) {
			int n = li1.next();
			if(l2.contains(n)) {
				tempList.add(n);
				li1.remove();
			}
		}
		
		Iterator<Integer> li2 = l2.iterator();
		while(li2.hasNext()) {
			int n = li2.next();
			if(tempList.contains(n)) {
				li2.remove();
			}
		}
		
		result.add(new ArrayList<>(l1));
		result.add(new ArrayList<>(l2));
		return result;
	}

}
