 package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		setWord("hippo");
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		int i = word.length();
		while (i > -1) {
			System.out.println(word.substring(0, i));
			i = i - 1;
		}
	}
}