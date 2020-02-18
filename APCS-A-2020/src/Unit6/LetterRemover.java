package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	//add in second constructor
	public LetterRemover(String s, char rem)
	{
		setRemover("I am Sam I am", 'a');
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = sentence;
		int loc = cleaned.indexOf(lookFor);
		while (loc != -1) {
			cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1, cleaned.length());
			loc = cleaned.indexOf(lookFor);
		}
		return cleaned; 
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}