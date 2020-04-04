package Q3Lab;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class reportList
{
	private String name;
	private ArrayList<Beach> beachList;
	
	public reportList()
	{
		name="";
		beachList=new ArrayList<Beach>();
	}
	
	public reportList(String name, int beaCount)
	{
		this.name=name;
		beachList=new ArrayList<Beach>();		
	}
	
	public void addBeach(int beaNum, Beach s)
	{
		beachList.add(s);
	}

	
	public String getAreaName()
	{
	   return name;	
	}
	
	public String getBeachName(int stuNum)
	{
		return beachList.get(stuNum).getName();
	}
	
	public double getHeightAverage()
	{
		double heightAverage=0.0;
		for(Beach s : beachList)
		{
			heightAverage=heightAverage+s.getHeight();
		}
		return heightAverage/beachList.size();
	}
	
	public double getTempAverage()
	{
		double tempAverage=0.0;
		for(Beach s : beachList)
		{
			tempAverage=tempAverage+s.getTemp();
		}
		return tempAverage/beachList.size();
	}
	
	public String toString()
	{
		String output=""+getAreaName()+"\n\n";
		for(Beach s : beachList)
		{
			output += s + "\n";
		}
		return output;
	}  	
}