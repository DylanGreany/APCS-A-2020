package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot
		Dog newDog = new Dog(age, name);
		//make sure spot is in bounds		
		if (spot >= 0 && spot < pups.length) {
			pups[spot] = newDog;
		}
	}

	public String getNameOfOldest()
	{
		int old = 0;
		for (int i = 1; i < pups.length; i++) {
			if(pups[i].getAge() > pups[i - 1].getAge()) {
				old = i;
			}
		}
		return pups[old].getName();
	}

	public String getNameOfYoungest()
	{
		int old = 0;
		for (int i = 1; i > pups.length; i++) {
			if(pups[i].getAge() > pups[i - 1].getAge()) {
				old = i;
			}
		}
		return pups[old].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}