package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test = new Toy("");
		
		test.setCount(1);
		test.setName("sorry");
		System.out.println(test);

		test.setCount(5);
		test.setName("gi joe");
		System.out.println(test);
	}
}