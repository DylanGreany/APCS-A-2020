package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality c = new StringEquality();
		
		c.setWords("hello", "goodbye");
		c.checkEquality();
		System.out.println(c);

		c.setWords("one", "two");
		c.checkEquality();
		System.out.println(c);
		
		c.setWords("three", "four");
		c.checkEquality();
		System.out.println(c);
		
		c.setWords("TCEA", "UIL");
		c.checkEquality();
		System.out.println(c);
		
		c.setWords("State", "Champions");
		c.checkEquality();
		System.out.println(c);
		
		c.setWords("ABC", "ABC");
		c.checkEquality();
		System.out.println(c);
		
		c.setWords("ABC", "CBA");
		c.checkEquality();
		System.out.println(c);
		
		c.setWords("Same", "Same");
		c.checkEquality();
		System.out.println(c);
	}
}