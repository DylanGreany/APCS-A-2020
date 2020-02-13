package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases	
		LetterRemover a = new LetterRemover();
		a.setRemover("I am Sam I am", 'a');
		System.out.print(a.toString());
		System.out.print(a.removeLetters());

	}
}