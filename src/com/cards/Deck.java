package com.cards;

import java.util.Random;
import java.util.Stack;

public class Deck {
	
	private Stack<Card> pile = new Stack<>();

	public int returnSize() {
		return pile.size();
	}
	
	public void addCard(Card card) {
		this.pile.push(card);
	}
	
	public Card removeCard() {
		return this.pile.pop();

	}
		
	public void initializeDeck() {
    
		for (int i=1; i < 14; i++) {
			pile.add(new Card('H', i));
		}
		
		for (int i=1; i < 14; i++) {
			pile.add(new Card('S', i));
		}
		
		for (int i=1; i < 14; i++) {
			pile.add(new Card('C', i));
		}
		
		for (int i=1; i < 14; i++) {
			pile.add(new Card('D', i));
		}
	}
	
	public void shuffle() {
		
        Random r = new Random(); 
     
        for (int i = this.pile.size()-1; i > 0; i--) { 

            int j = r.nextInt(i+1); 
                   
            Card temp = this.pile.get(i);
            this.pile.set(i, pile.get(j));
            this.pile.set(j, temp);
        }
        
	}
	
	public void printDeck() {
		
		for (int i=this.pile.size()-1; i >= 0; i--) {
			
			System.out.print(pile.get(i).getSuite() + ":" + pile.get(i).getValue() + "\t");
			
			if (i%13 == 0) {
				System.out.println("");
			}
		}
		System.out.println("****");
		
	}
	
}
