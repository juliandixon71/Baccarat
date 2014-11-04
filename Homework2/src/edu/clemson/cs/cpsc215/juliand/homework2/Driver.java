// Julian Dixon CPSC 215 Homework 2
// 1/30/2014

package edu.clemson.cs.cpsc215.juliand.homework2;

public class Driver {

	public static void main(String[] args) {
		Hand dealer = new Hand();
		Hand player = new Hand();
		
		for (int i = 0; i < 2; i++) {
			dealer.dealCard();
		}
		
		for (int i = 0; i < 2; i++) {
			player.dealCard();
		}
		
		System.out.println("Player's hand..");
		System.out.println(player.toString());
		System.out.println("Score is " + player.score());
		
		System.out.println("Dealer's hand..");
		System.out.println(dealer.toString());
		System.out.println("Score is " + dealer.score());
		
		System.out.println("\n");
		
		// if neither hand has a score above 8
		if (player.score() < 8 && dealer.score() < 8) {
			// if the player has a score less than 5
			if (player.score() < 5) {
				System.out.println("Player draws..");
				player.dealCard();
			}
			// if the player drew
			if (player.size() > 2) {
				int playerLast = player.getLasCard().getBaccaratValue();
				
				// if player drew 2 or 3
				if (playerLast > 1 && playerLast < 3) {
					// if dealer is between 0 and 4
					if (dealer.score() <= 4) {
						System.out.println("Dealer draws..");
						dealer.dealCard();
					}
				}
				// if player drew 4 or 5
				else if (playerLast > 3 && playerLast < 6) {
					// if dealer is between 0 and 5
					if (dealer.score() <= 5) {
						System.out.println("Dealer draws..");
						dealer.dealCard();
					}
				}
				// if player drew 6 or 7
				else if (playerLast > 5 && playerLast < 8 ) {
					// if dealer is between 0 and 6
					if (dealer.score() <= 6) {
						System.out.println("Dealer draws..");
						dealer.dealCard();
					}
				}
				// if player drew 8
				else if (playerLast == 8) {
					// if dealer is between 0 and 2
					if (dealer.score() <= 2) {
						System.out.println("Dealer draws..");
						dealer.dealCard();
					}
				}
				// if player drew Ace, 9, 10, or face
				else if (playerLast == 1 || playerLast >= 9) {
					// if dealer is between 0 and 3
					if (dealer.score() <= 3) {
						System.out.println("Dealer draws..");
						dealer.dealCard();
					}
				}		
			}
			// if the player does not draw
			else {
				// if banker is between 0 and 5
				if (dealer.score() <= 5) {
					System.out.println("Dealer draws..");
					dealer.dealCard();
				}
			}
		}
		
		System.out.println("\n");
		
		// print the hands again and determine the winner
		System.out.println("Player's hand..");
		System.out.println(player.toString());
		System.out.println("Score is " + player.score());
		
		System.out.println("Dealer's hand..");
		System.out.println(dealer.toString());
		System.out.println("Score is " + dealer.score());
		
		if (player.score() > dealer.score())
			System.out.println("Player wins!");
		else
			System.out.println("Dealer winds!");
		
		// and we're done
	}

}
