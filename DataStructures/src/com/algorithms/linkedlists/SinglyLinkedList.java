package com.algorithms.linkedlists;

public class SinglyLinkedList {
	
	private static ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static int length() {
		if(head==null)
			return 0;
		int count = 0;
		ListNode current = head;
		while(current!=null) {
			count++;
			current = current.next;
		}
		
		return count;
	}
	
	public static void main(String []args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(5);
		ListNode first = new ListNode(6);
		ListNode second = new ListNode(7);
		ListNode third = new ListNode(8);
		
		head.next = first;
		first.next = second;
		second.next = third;
		
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current = current.next;
		}
		
		System.out.println("null");
		
		System.out.println("Length of List:"+length());
	}

}
