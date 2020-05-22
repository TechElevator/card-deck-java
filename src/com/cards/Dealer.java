package com.cards;

import java.util.Scanner;

public class Dealer {
	
	public static void main (String args[]) {
		
		Deck leftDeck = new Deck();
		Deck rightDeck = new Deck();
		
		leftDeck.initializeDeck();
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		while (!input.equals("5")) {
			System.out.println("Enter an Option:");
			System.out.println("1)L to R  2)R to L  3)Shuffle L 4)Shuffle R  5)Quit");
			
			leftDeck.printDeck();
			rightDeck.printDeck();
			
			input = scanner.nextLine();
			
			if (input.equals("1")) {
				
				if (leftDeck.returnSize() == 0) {
					System.out.println("Nothing to transfer.");
				}
				else {
					System.out.println("Moving from left to right");
					Card cardToTransfer = leftDeck.removeCard();
					rightDeck.addCard(cardToTransfer);
				}
			}
			else if (input.equals("2")) {
				
				if (rightDeck.returnSize() == 0) {
					System.out.println("Nothing to transfer.");
				}
				else {
					System.out.println("Moving from right to left");
					Card cardToTransfer = rightDeck.removeCard();
					leftDeck.addCard(cardToTransfer);
				}
				
			}
			else if (input.equals("3")) {
				System.out.println("Shuffling left pile");
				leftDeck.shuffle();;
			}
			else if (input.equals("4")) {
				System.out.println("Shuffling right pile");
				rightDeck.shuffle();;
			}
			else if (input.equals("5")) {
				continue;
			}
			else {
				System.out.println("Bad input.");
			}
		}
		
		scanner.close();
		
	}

}
