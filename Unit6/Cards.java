package Unit6;

import java.util.*;

public class Cards {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] deck = new int[52];
		String[] suits = { "Spades", "Clubs", "Hearts", "Diamonds" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		for (int i = 0; i < deck.length; i++) {
			deck[i] = (int) (Math.random() * deck.length) + 1;
		}
		for (int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card Number " + deck[i] + ": " + rank + " of " + suit);
		}
		scnr.close();
	}
}