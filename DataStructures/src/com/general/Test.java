package com.general;

import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []suit = {"S","D","M","R"};
		String rank[] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		
		String deck[] = new String[52];
		
		System.out.println(Arrays.toString(suit));
		for(int i=0;i<deck.length;i++) {
			deck[i] = rank[i%13]+suit[i/13];
		}
		
		System.out.println(Arrays.toString(deck));
		
		// Shuffling the deck
		
		Random rand = new Random();
		String temp = null;
		for(int i=0;i<deck.length;i++) {
			int index = i+rand.nextInt(deck.length-i);
			temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		System.out.println("Shuffled Deck:"+Arrays.toString(deck));
	}

}
