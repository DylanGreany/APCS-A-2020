package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	
	private int Numerator, Denominator;
	
	//write two constructors
	
	public Rational() 
	{
		setRational(1,1);
	}
	
	public Rational(int num, int den)
	{
		setRational(num, den);
	}

	//write a setRational method
	
	public void setRational(int num, int den) 
	{
		Numerator = num;
		Denominator = den;
	}

	//write  a set method for numerator and denominator

	public void setNumerator(int num)
	{
		Numerator = num;
	}
	
	public void setDenominator(int den)
	{
		Denominator = den;
	}
	
	public void add(Rational  other)
	{	
		int newNum = (Numerator * other.getDenominator() + other.getNumerator() * Denominator);
		int newDen = (Denominator * other.getDenominator());
		
		Numerator = newNum;
		Denominator = newDen;

		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(Numerator, Denominator);
		Numerator = Numerator/gcd;
		Denominator = Denominator/gcd;
	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne, numTwo);
		for (int i = min; i > 1; i--) {
			if (numOne % i == 0 && numTwo % i == 0) 
				return i;
		}

		return 1;
	}

	public Object clone ()
	{
		return this;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	public int getNumerator()
	{
		return Numerator;
	}
	
	public int getDenominator()
	{
		return Denominator;
	}
	
	public boolean equals( Object obj)
	{
		Rational other = (Rational)obj;
		return (double)other.getNumerator()/other.getDenominator() == (double)this.getNumerator()/this.getDenominator();
		
	}

	public int compareTo(Rational other)
	{
		if ((double)this.getNumerator()/this.getDenominator() > (double)other.getNumerator()/other.getDenominator())
			return 1;
		else
			return -1;
	}



	
	//write  toString() method
	
	public String toString()
	{
		return Numerator + "/" + Denominator;
	}
	
}