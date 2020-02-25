package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response;
		
		//add in a do while loop after you get the basics up and running
		do {
			out.print("type in your prompt [R,P,S] :: ");
			//read in the player value
			response = keyboard.next();
			RockPaperScissors game = new RockPaperScissors();	
			game.setPlayers(response);
			System.out.println(game);
			System.out.println("Do you want to play again? [y/n]");
		}
		while (keyboard.next().equals("y"));
			
	}
}



