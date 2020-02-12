package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	    WordsCompare c = new WordsCompare();
		
		c.setWords("abe", "ape");
		c.compare();
		System.out.println(c);

		c.setWords("giraffe", "gorilla");
		c.compare();
		System.out.println(c);
		
		c.setWords("one", "two");
		c.compare();
		System.out.println(c);
		
		c.setWords("fun", "funny");
		c.compare();
		System.out.println(c);
		
		c.setWords("123", "19");
		c.compare();
		System.out.println(c);
		
		c.setWords("193", "1910");
		c.compare();
		System.out.println(c);
		
		c.setWords("goofy", "godfather");
		c.compare();
		System.out.println(c);
		
		c.setWords("funnel", "fun");
		c.compare();
		System.out.println(c);
	}
}