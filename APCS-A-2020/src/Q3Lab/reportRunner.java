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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


class reportRunner {
	public static void main(String[] args) throws IOException   {
		Scanner file = new Scanner(new File("src/Q3Lab/reportData.dat"));
		String area = file.nextLine();
		int numBeaches = file.nextInt();
		file.nextLine();
		
		reportList List = new reportList(area, numBeaches);
		
		for(int i=0; i<numBeaches; i++)
		{
			String beachName = file.nextLine();
			String report = file.nextLine();		
			List.addBeach(i, new Beach(beachName, report));
		}
		
		out.println("\n\n"+List);
		out.println("Average Wave Height = " + List.getHeightAverage());
		out.println("Average Temperature = " + List.getTempAverage());
	}
}