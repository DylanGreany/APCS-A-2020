package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.awt.Color;

public class CardRunner
{
	public static void main( String args[] )
	{
		
		Card one = new Card("NINE", "SPADES", 9);
		out.println(one.getSuit());
		out.println(one.getFace());

		Card two = new Card("ACE", "DIAMONDS", 1);
		out.println(two);
		two.setFace(3);
		two.setRank("THREE");
		out.println(two);

		Card three = new Card("FOUR", "CLUBS", 4);
		out.println(three);

		Card four = new Card("QUEEN", "SPADES", 12);
		out.println(four);

		Card five = new Card("QUEEN", "HEARTS", 12);
		out.println(five);
		
	}
}   