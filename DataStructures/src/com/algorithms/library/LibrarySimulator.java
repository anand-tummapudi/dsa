package com.algorithms.library;

import java.util.Scanner;

public class LibrarySimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please Enter your Choice:");
		
		String choice = scn.nextLine();
		
		switch(choice) {
		
		case "1": System.out.println("Add Book");
				break;
		case "2": System.out.println("List Books");
				break;
		case "3":System.out.println("Search Book");
				break;
		case "4": System.out.println("Issue Book");
				break;
		case "5": System.out.println("Return Book");
				break;
				
		}
		
		scn.close();
	}

}
