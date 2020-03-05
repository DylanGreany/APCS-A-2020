package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		for (int i = 0; i < toys.length(); i++) {
			
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		int count;
  		for (int i = 0; i < toyList.size(); i++) {
  			if (nm.equals(toyList.get(i))) {
  				count++;
  				Toy.setCount(count);
  			}
  		}
  		return null;
  	}
  
  	
  	//ex
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	
  	//ex
  	public void sortToysByCount()
  	{
  	}  
  	  
  	
  	
	public String toString()
	{
	   return "";
	}
}