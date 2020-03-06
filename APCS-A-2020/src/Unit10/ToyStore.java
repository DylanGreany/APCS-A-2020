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
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] list = toys.split(" ");
		for (String i : list) {
			Toy new1 = getThatToy(i);
			if (new1 != null) {
				new1.setCount(new1.getCount()+1);
			}
			else {
				toyList.add(new Toy(i));
			}
		}
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy i : toyList) {
  			if(i.getName().equals(nm)) {
  	  				return i;
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
		String output = "";
		for (Toy toy : toyList) {
			output += toy + ", ";
		}
		return output;
	}
}