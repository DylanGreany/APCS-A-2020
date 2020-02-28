package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String faceRank[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	//instance variables
			//String suit
	private String rank; 
	private String suit;
			//int face
	private int faceVal;

	public Card(String cardSuit, int cardValue) 
	{
		setSuit(cardSuit);
		setFace(cardValue);
	}
	public Card(String cardRank, String cardSuit, int cardValue) 
	{
		setSuit(cardSuit);
		setFace(cardValue);
		setRank(cardRank);
	}
	// modifiers
		//set methods
	public void setSuit(String cardSuit) 
	{
		suit = cardSuit;
	}
	public void setFace(int cardValue) 
	{
		faceVal = cardValue;
	}
	public void setRank(String cardRank) 
	{
		rank = cardRank;
	}
	
  	//accessors
		//get methods
	public String getSuit() 
	{
		return suit;
	}
	public String getRank() 
	{
		return rank;
	}
	public int getFace() 
	{
		return faceVal;
	}

	public boolean equalsCard() 
	{
		if ()
	}
  	//toString
	
	public String toString() 
	{
		if(faceVal == 0)
			return rank + " of " + suit;
		else
			return rank + " of " + suit + "(point value = " + faceVal + ")";
	}

 }