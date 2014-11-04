// Julian Dixon CPSC 215 Homework 2
//  1/30/2014

package edu.clemson.cs.cpsc215.juliand.homework2;

import java.util.Random;

public class Card {
	
	private int cardValue;
	private int cardSuit;
	
	public int getCardValue() {
		return cardValue;
	}
	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}
	public int getCardSuit() {
		return cardSuit;
	}
	public void setCardSuit(int cardSuit) {
		this.cardSuit = cardSuit;
	}
	
	public Card() {
		Random generator = new Random();
		
		// generate a random number between 0 and 13
		this.cardValue = generator.nextInt(13);
		// and between 0 and 3
		this.cardSuit = generator.nextInt(3); 
	}
	
	public String toString() {
		String [] cardNums = new String[13];
		String [] cardSuits = new String [4];
		
		// set 1 to 10 
		// use the object Integer for the toString method
		for (Integer i = 0; i < 10; i++) {
			cardNums[i] = i.toString();
		}
		// now set Ace, Jack, Queen, King
		cardNums[0] = "Ace";
		cardNums[10] = "Jack";
		cardNums[11] = "Queen";
		cardNums[12] = "King";
		
		// map the suits
		cardSuits[0] = "Clubs";
		cardSuits[1] = "Diamonds";
		cardSuits[2] = "Spades";
		cardSuits[3] = "Hearts";
		
		String cardSentence = cardNums[this.cardValue] + " of " + cardSuits[this.cardSuit];
		
		return cardSentence;
	}
	
	public int getBaccaratValue() {
		int ret;
		
		// if we have a 10, Jack, Queen, or King
		if (cardValue > 9)
			ret = 0;
		// if we have an Ace
		else if (cardValue == 0)
			ret = 1;
		else
			ret = cardValue;
		
		return ret;
	}
}
