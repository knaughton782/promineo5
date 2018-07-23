package cardDeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards;
	
	//constructor
	public Deck() {
		cards = new ArrayList<Card>(); 
		for (int i = 0; i < 4; i++) {
			for (int j = 2; j < 15; j++) {
				cards.add(new Card(j, createCardName(i, j)));
			}	
		}	
		shuffleList();
	}
	
	//methods
	public void shuffleList() {
		Collections.shuffle(cards);
	}
	
	
	public Card draw() {
		//System.out.println(cards.size());
		return cards.remove(0);
		
	}
	
	
	private String createCardName(int suit, int value) {
		return new StringBuilder()
			.append(determineValueString(value))
			.append(" of ")
			.append(determineSuitString(suit))
			.toString();
	}
	
	private String determineSuitString(int suit) {
		String result = "";
		switch (suit) {
			case 0: 
				result = "Hearts";
				break;
			case 1:
				result = "Diamonds";
				break;
			case 2:
				result = "Clubs";
				break;
			case 3:
				result = "Spades";
				break;
			default:
				result = "Default";
		}
		return result;
	}
	
	private String determineValueString(int value) {
		String result = "";
		
		switch (value) {
			case 11:
				result = "Jack";
				break;
			case 12:
				result = "Queen";
				break;
			case 13:
				result = "King";
				break;
			case 14:
				result = "Ace";
				break;
			default:
				result = "" + value;
		}
		return result;
	}
	

}
