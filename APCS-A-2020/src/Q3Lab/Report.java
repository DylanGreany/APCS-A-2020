package Q3Lab;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays; 
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Report
{
	private String report;
	private double height;
	private int temp;
	private boolean wind;
	public Report()
	{
		setReport("");
	}
	
	public Report(String spotReport)
	{
		setReport(spotReport);	
	}
	
	public void setReport(String spotReport) 
	{
		Scanner chop = new Scanner(spotReport);
		report = "";
		height = chop.nextDouble(); 
		temp = chop.nextInt();
		report+= "Wave Height(ft): " + height + ", Water Temp(F*): " + temp;
		wind = chop.nextBoolean();
		if (wind == true) {
			report+= ", Wind: Offshore";
		}
		else {
			report+= ", Wind: Onshore";
		}
	}
	
	public double getHeight() {
		return this.height;
	}

	public int getTemp() {
		return this.temp;
	}
	
	public String toString()
	{
		return report;
	}	
}