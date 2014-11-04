// Julian Dixon CPSC 215 Homework 2
// 1/30/2014

package edu.clemson.cs.cpsc215.juliand.homework2;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> cards;
	
	public Hand() {
		this.cards = new ArrayList<Card>();
	}
	
	
	public void dealCard() {
		Card newcard = new Card();
		cards.add(newcard);
	}
	public Card getLasCard() {
		int i = cards.size() - 1;
		
		return cards.get(i);
	}
	public int score() {
		int score = 0;
		Card temp;
		
		for (int i = 0; i < cards.size(); i++) {
			// get the card and add the total numbers
			temp = cards.get(i);
			score = score + temp.getBaccaratValue();
		}
		
		// the final score is the last digit of the sum of the values
		score = score % 10;
		
		return score;
	}
	public int size() {
		return cards.size();	
	}
	public String toString() {
		String handSentence = cards.get(0).toString();
		
		for (int i = 1; i < cards.size(); i++) {
			handSentence = handSentence + ", " + cards.get(i).toString();
		}
		
		return handSentence;
	}
}
