class Card {

	private int number;
	private int suit;

	public Card(int number, int suit){
		setNumber(number);
		setSuit(suit);

	}

	public int number(){
		return this.number;
	}

	public int suit(){
		return this.suit;
	}

	public void setNumber(int number){
		this.number = number;
	}

	public void setSuit(int suit){
		this.suit = suit;
	}

	
}