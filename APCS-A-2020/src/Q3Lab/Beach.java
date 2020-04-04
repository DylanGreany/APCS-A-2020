package Q3Lab;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Comparable;


public class Beach
{
	private String myName;
	private Report myReport;
	
	public Beach()
	{
		setName("");
		setReport("");
	}
	
	public Beach(String name, String report)
	{
		setName(name);
		setReport(report);
	}
	
	public void setName(String name)
	{
		myName=name;
	}	
	
	public void setReport(String spotReport)
	{
		myReport = new Report(spotReport);		
	}
	
	public String getName()
	{
		return myName;
	}
	
	public double getHeight() {
		return myReport.getHeight();
	}
	
	public int getTemp() {
		return myReport.getTemp();
	}
	
	
	public String toString()
	{
		return myName + " : " + myReport.toString();
	}

}	
