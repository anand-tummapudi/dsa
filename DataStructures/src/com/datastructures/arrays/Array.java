package com.datastructures.arrays;

public class Array {
	private int [] items;
	private int count=0;
	
	public Array(int size){
		items = new int[size];
	}
	
	
	public void print() {
		for (int i=0;i<count;i++) {
			System.out.println(items[i]);
		}
	}
	
	public void add(int item) {
		if(items.length==count) {
			int[] newItems = new int[count*2];
			for(int i=0;i<count;i++) {
				newItems[i] = items[i];
			}
			
			items = newItems;
		}
		items[count++] = item;
		
	} 
	
	public void remove(int index) {
		
		if(index<0 || index>=count) {
			throw new IllegalArgumentException("Illegal Argument");
		}
		
		for(int i=index;i<count;i++) {
			items[i] = items[i+1];
		}
		
		count--;
	}
	
	public int indexOf(int item) {
		for(int i=0;i<count;i++) {
			if(items[i]==item)
				return i;
		}
		return -1;
	}

}
