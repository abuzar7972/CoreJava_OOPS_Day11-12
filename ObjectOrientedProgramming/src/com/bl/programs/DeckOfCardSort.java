package com.bl.programs;
import java.util.ArrayList;
public class DeckOfCardSort {
	public static void main(String[] args) {
		 int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // Shuffle the cards
        for (int i1 = 1; i1 < 5; i1++) {
        	int z=0;
        	z++;
            System.out.println("For player" + i1);
            for (int j = 1; j <= 9; j++) {
                int index = (int) (Math.random() * deck.length);
                int temp = deck[i1];
                deck[i1] = deck[index];
                deck[index] = temp;
                String suit = suits[deck[i1] / 13];
                String rank = ranks[deck[i1] % 13];
                System.out.println(rank + " of " + suit);
               // String[] stringArray1 = null;
              //  stringArray1[z]=rank;
                //System.out.println(stringArray1);
            }
            
        }
   
	}
}
