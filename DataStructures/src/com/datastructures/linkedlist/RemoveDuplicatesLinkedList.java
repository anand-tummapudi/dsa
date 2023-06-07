package com.datastructures.linkedlist;

import java.util.LinkedList;

public class RemoveDuplicatesLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(5);
		ll.add(6);
		
		System.out.println(ll);
		
		LinkedList<Integer> result = removeDuplicates(ll);
		
		System.out.println(result);
		
	}

	private static LinkedList<Integer> removeDuplicates(LinkedList<Integer> ll) {
			for(int i=0;i<ll.size()-1;i++) {
				if(ll.get(i)==ll.get(i+1)) {
					ll.remove(i);
				}
			}
		return ll;
	}

}
