package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		@SuppressWarnings("resource")
		Scanner file = new Scanner(new File("/Users/arnavkanodia/git/APCSA2020/APCS-A-2020/src/Unit13/wordsorttwo.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			String sentence = file.nextLine();
			WordSortTwo w = new WordSortTwo(sentence);
			w.sort();
			System.out.println(w);
		}
	}
}