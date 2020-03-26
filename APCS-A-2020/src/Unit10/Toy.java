package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
	}

	public Toy(String nm)
	{
		setName(nm);
	}
	
	public int getCount()
	{
		return 0;
	}
	
	public void setCount( int cnt )
	{
		this.count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		this.name = nm;
	}

	public String toString()
	{
	   return name + " " + count;
	}
}