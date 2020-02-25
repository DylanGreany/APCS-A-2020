package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(' ');
		setAmount(0);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		int r = amount;
		String output="";
		for (int y = amount; y > 0; y--) {
			int n = amount;
			for (int i = 0; i < r; i++) {
				for (int x = n; x > 0; x--) {
					if (letter + i > 122) {
						output += (char)(letter + i - 26);
					}
					else {
						output += (char)(letter + i);	
					}
				}
				output += " ";
				n--;
			}
			output += "\n";
			r--;
		}
		return output;
	}
}