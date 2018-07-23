package cardDeck;

/*
 * Create the following classes that interact with each other:
 *  o	Card
 *		-	Fields
 *			•	Value (e.g. 2 – 10 are their respective values. Jack – Ace is 11 – 14)
 *			•	Name (e.g. Ace of Diamonds, or Two of Hearts)
 *		-	Methods
 *			•	Getters and setters for the fields
 *			•	A method that prints out information about the card
 *	o	Deck
 *		-	Fields
 *			•	A List of Card
 *		-	Methods
 *			•	Shuffle (should randomize the order of the cards)
 *			•	Draw (should remove the top card from the list of cards and return it)
 *			•	In the constructor, when a new Deck is instantiated, it should have the standard 52 cards in a Deck.
 *	o	Player
 *		-	Fields
 *			•	Hand (List of Card)
 *			•	Score
 *			•	Name
 *		-	Methods
 *			•	Describe (should print out info about the Player)
 *			•	Discard (should remove a specific card from the Hand field)
 *			•	Draw (should take a Deck as an argument and call the draw() method on the Deck an add the returned Card to the hand field)
 */

public class Start {

	public static void main(String[] args) {
		
		Deck myDeck = new Deck();
		Player player1 = new Player("Joe");
		Player player2 = new Player("Will");
		
		for (int i = 0; i < 7; i++) {
			player1.draw(myDeck);
			player2.draw(myDeck);
		}
		System.out.println(player1.getName());
		System.out.println("____________________");
		player1.checkHand();
		
		System.out.println(player2.getName());
		System.out.println("____________________");
		player2.checkHand();
	}

}
