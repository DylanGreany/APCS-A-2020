package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(0);
		greatestCommonFactor(0, 0, 0);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
		for (int f = 1; f <= c; f++) {
			if(a % f == 0 && b % f == 0 && c % f == 0) {
				max = f;
			}
		}
		return max;
	}

	public String toString()
	{
		String output="";
		for (int a = 1; a <= number; a++) 
		{
			for (int b = 1; b <= number; b++)
			{
				for (int c = 1; c <= number; c++)
				{
					if (a*a + b*b == c*c) 
					{
						if (((a % 2 == 0) && (b % 2 == 1)) || ((a % 2 == 1) && (b % 2 ==0)))
						{
							if (c % 2 == 1)
							{
								if (greatestCommonFactor(a,b,c) == 1)
								{
									output += ""+ a + " " + b + " " + c +"" + "\n";
								}
							}
						}
					}
				}
			}
		}
		return output+"\n";
	}
}