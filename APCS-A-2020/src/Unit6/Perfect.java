package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   
   public Perfect() 
   {
   }
   
   public Perfect(int n)
   {
	   setNumber(0);
   }

	//add a set method
   
   public void setNumber(int n)
   {
	   number = n;
   }
   public boolean isPerfect()
   {
	   int total = 0;
	   int x = 1;
	   while (x < number) {
		   if (number % x == 0) {
			   total = x + total;
			   x = x + 1;
		   }
		   else {
			   x = x + 1;
		   }
	   }
	   if (total == number) 
		   return true;
	   else
		   return false;
   }

	//add a toString	
	
   public String toString()
   {
	   if (isPerfect() == true)
		   return number + " is perfect.";
	   else
		   return number + " is not perfect";	   
   }
}