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
	public static final String faceRank[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	private List<Card> cards;
	private int top;
	private int size;
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
				
				cards.add(new Card(faceRank[f], SUITS[s], f));
			}
		}
		size = cards.size();
		top = size - 1;
		shuffle();
	}
	
	
public Deck(String[] rnk, String[] st, int[] p) {
		
		//refer cards to new ArrayList
		cards = new ArrayList<Card>();
		
		//set top to the top of the deck 51
		top = 51;
		
		//loop through all suits
		for (int s = 0; s < st.length; s++) {
			//loop through all faces 1 to 13
			for (int f = 0; f < rnk.length; f++) {
				//add a new TwentyOneCard to the deck
				
				cards.add(new Card(rnk[f], st[s], f));
			}
		}
		size = cards.size();
		top = size - 1;
		shuffle();
	}
	
	
	public boolean isEmpty() {
		if (size <= 0)
			return true;
		else
			return false;
	}
	
	public int size() {
		return size;
	}
   
   //make a dealCard() method that returns the top card
   public Card dealCard() {
	   if(isEmpty()) {
		   return null;
	   }
	   Card deal = cards.get(top);
	   size--;
	   top--;
	   return deal;
	   
   }
   
  
   //write a shuffle() method
   public void shuffle() {
	   size = cards.size();
		
		for (int k = 0; k < this.size; k++) {
			 int j = (int) (Math.random() * this.size);
			 Card card1 = cards.get(k);
			 Card card2 = cards.get(j);
			 cards.set(k, card2);
			 cards.set(j, card1);
		}
	   	//reset the top card 
		top = this.size() - 1;
   }
   
   public String toString() {
		String str = "";
		str += "size = " + size;
		if (isEmpty()) {
			str+="\nDealt cards:\n";
			for (int i = 0; i <= cards.size()-1; i++) {
				str += cards.get(i) + ", ";
			}
		}else {
			str +="\nUndealt cards:\n";
			for (int i = 0; i <= size-1; i++) {
				str += cards.get(i) + ", ";
			}
		}
		return str;
	}
}