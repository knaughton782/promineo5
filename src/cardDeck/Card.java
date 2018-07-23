package cardDeck;

public class Card {

	private int value;
	private String name;
	
	//constructor
	public Card(int value, String name) {
		this.value = value; 
		this.name = name;
	}
	
	
	//methods
	@Override
	public String toString() {
		return "Name: " + name + " -  Value: " + value;
	}
	
	
	//getters and setters
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
