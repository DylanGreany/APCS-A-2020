package Unit0;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();
		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
		
		System.out.print("Enter a new integer :: ");
		shortOne = keyboard.nextShort();
		System.out.print("Enter a new integer :: ");
		shortTwo = keyboard.nextShort();

		System.out.print("Enter a decimal :: ");
		doubleOne = keyboard.nextDouble();
		System.out.print("Enter a decimal :: ");
		doubleTwo = keyboard.nextDouble();
		
		System.out.print("Enter a new decimal :: ");
		floatOne = keyboard.nextFloat();
		System.out.print("Enter a new decimal :: ");
		floatTwo = keyboard.nextFloat();

		//add in input for all variables


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println("new integer one = " + shortOne );
		System.out.println("new integer two = " + shortTwo );
		System.out.println("decimal one = " + doubleOne );
		System.out.println("decimal two = " + doubleTwo );
		System.out.println("new decimal one = " + floatOne );
		System.out.println("new decimal two = " + floatTwo );

		//add in output for all variables


	}
}