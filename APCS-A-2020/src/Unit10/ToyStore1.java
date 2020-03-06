package Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore1
{
	private ArrayList<Toy> toyList;

	public ToyStore1()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] list = toys.split(" ");
		for (String i : list) {
			Toy new1 = getThatToy(i);
			if (new1 == null) {
				toyList.add(new Toy(i, 1));
				
			}
			else {
				int count = new1.getCount();
				new1.setCount(count + 1);
			}
		}
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy a : toyList) {
  			if(a.getName().equals(nm)) {
  	  			return a;
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
  	  
  	public String myName() {
  		System.out.println("Dylan Greany");
  		return null;
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