package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		Word a = new Word();
		a.setString("Hello");
		System.out.println(a);
		
		System.out.println();

		a.setString("World");
		System.out.println(a);
		
		System.out.println();

		a.setString("JukeBox");
		System.out.println(a);
		
		System.out.println();
		
		a.setString("TCEA");
		System.out.println(a);

		System.out.println();
		
		a.setString("UIL");
		System.out.println(a);
	}
}