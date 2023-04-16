package com.algorithms;

import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {
	
	public static void main(String []args) {
		
		String []suit = {"S","D","C","M"};
		String []rank = {"2","3","4","5","6","7","8","9","10","J","K","Q","A"};
		
		String []deck = new String[52];
		deck = createDeck(suit,rank,deck);
		
		System.out.println(Arrays.toString(deck));
		
		shuffleDeck(deck);
		
		System.out.println("Pick Top Card:"+pickCard(deck, 0));
		System.out.println("Pick Bottom Card:"+pickCard(deck, 51));
		
		System.out.println("Pick 15th Card:"+pickCard(deck, 14));
	}

	private static void shuffleDeck(String[] deck) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		for(int i=0;i<deck.length;i++) {
			int index = i+rand.nextInt(52-i);//(int)Math.random()*deck.length;
			String temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		System.out.println("##### Shuffled Deck #####");
		
		System.out.println(Arrays.toString(deck));
		
	}

	private static String[] createDeck(String[] suit, String[] rank, String[] deck) {
		// TODO Auto-generated method stub
		for(int i=0;i<deck.length;i++) {
			deck[i] = rank[i%13]+suit[i/13];
		}
		return deck;
	}
	
	private static String pickCard(String []deck,int index) {
		return deck[index];
	}

}
