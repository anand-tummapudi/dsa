package com.general;

public class DoublyLinkedList {
	
	class Node{
		int data;
		Node next;
		Node Previous;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node head,tail = null;
	
	public void addNode(int data) {
		
		Node newNode = new Node(data);
		
		if(head==null) {
			head = tail = newNode;
			head.Previous = null;
			tail.next = null;
		}else {
			
			tail.next = newNode;
			newNode.Previous = tail;
			tail = newNode;
			tail.next = null;
		}
		
	}
	
	public void display() {
		
		Node current = head;
		if(head==null) {
			System.out.println("List is empty");
			
			return;
		}
		
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}
	
	public static void main(String []args) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.addNode(1);
		list.addNode(3);
		list.addNode(4);
		
		list.display();
		
	}

}
