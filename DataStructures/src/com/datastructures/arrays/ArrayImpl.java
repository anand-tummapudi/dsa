package com.datastructures.arrays;

public class ArrayImpl {
	
	public static void main(String []args) {
		Array numbers = new Array(3);
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.print();
		
		System.out.println("Remove ELement");
		
		numbers.remove(2);
		numbers.print();
		
		System.out.println("Index of an element");
		int index = numbers.indexOf(40);
		System.out.println(index);
		
	}
	
}
