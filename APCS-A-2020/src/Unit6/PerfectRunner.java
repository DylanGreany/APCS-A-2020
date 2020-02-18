package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Perfect a = new Perfect();
		a.setNumber(496);
		a.isPerfect();
		System.out.println(a);
		
		a.setNumber(45);
		a.isPerfect();
		System.out.println(a);
		
		a.setNumber(6);
		a.isPerfect();
		System.out.println(a);
		
		a.setNumber(14);
		a.isPerfect();
		System.out.println(a);
		
		a.setNumber(8128);
		a.isPerfect();
		System.out.println(a);
		
		a.setNumber(1245);
		a.isPerfect();
		System.out.println(a);
		
		a.setNumber(33);
		a.isPerfect();
		System.out.println(a);

		a.setNumber(28);
		a.isPerfect();
		System.out.println(a);
		
		a.setNumber(27);
		a.isPerfect();
		System.out.println(a);
		
		a.setNumber(33550336);
		a.isPerfect();
		System.out.println(a);
																
	}
}