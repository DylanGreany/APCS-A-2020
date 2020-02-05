package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import Unit2.Line;

import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter first x-coordinate :: ");
		int x1 = keyboard.nextInt();
		System.out.print("Enter first y-coordinate :: ");
		int y1 = keyboard.nextInt();
		System.out.print("Enter second x-coordinate :: ");
		int x2 = keyboard.nextInt();
		System.out.print("Enter second y-coordinate :: ");
		int y2 = keyboard.nextInt();
		
		Distance test = new Distance(x1, y1, x2, y2);
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		test.getDistance();
		System.out.println(test);
		
			
	}
}