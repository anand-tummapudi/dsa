package com.datastructures.arrays;

import java.util.Arrays;

public class FindKthElement {
	private int[] array;
	private int element;
	
	public FindKthElement(int array[],int element) {
		this.array = array;
		this.element = element;
	}
	
	public int findElement() {
		Arrays.sort(this.array);
		int element = this.array[this.element-1];
		return element;
	}
	
	public static void main(String args[]) {
		int []array = {2,3,6,12,7,5,9,10};
		int element = 5;
		
		FindKthElement findEle = new FindKthElement(array, element);
		int result = findEle.findElement();
		System.out.println(Arrays.toString(array));
		System.out.println(element+"th Smallest Result:"+result);
	}

}
