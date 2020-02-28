package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
class Deck{
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;

	//make a Deck constructor
	public Deck() {
		
		//refer cards to new ArrayList
		cards = new ArrayList<Card>();
		
		//set top to the top of the deck 51
		top = 51;
		
		//loop through all suits
		for (int s = 0; s < SUITS.length; s++) {
			//loop through all faces 1 to 13
			for (int f = 1; f <= 13; f++) {
				//add a new TwentyOneCard to the deck
				cards.add(new Card(SUITS[s], f));
			}
		}
	}
   
   //make a dealCard() method that returns the top card
   public Card dealCard() {
	   return cards.get(0);
   }
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
}