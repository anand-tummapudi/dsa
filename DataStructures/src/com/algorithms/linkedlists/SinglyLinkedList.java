package com.algorithms.linkedlists;

public class SinglyLinkedList {
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String args) {
		
		ListNode head = new ListNode(5);
		ListNode first = new ListNode(6);
		ListNode second = new ListNode(7);
		ListNode third = new ListNode(8);
		
		head.next = first;
		first.next = second;
		second.next = third;
		
	}

}
