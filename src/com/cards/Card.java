package com.cards;

public class Card {

	private char suite;
	private int value;
	
	Card(char suite, int value) {
		this.suite = suite;
		this.value = value;
	}
	
	public char getSuite() {
		return suite;
	}
	public void setSuite(char suite) {
		this.suite = suite;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}	
}
