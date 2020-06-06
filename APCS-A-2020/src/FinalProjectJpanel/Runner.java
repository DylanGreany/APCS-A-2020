package FinalProjectJpanel;

import javax.swing.JFrame;   
import java.awt.Component;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Runner extends JFrame
{
	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;
	private static int passScore;
	
	public Runner()
	{
		
		super("Game");
		setSize(WIDTH,HEIGHT);
		IntroScreen intro = new IntroScreen();
		((Component)intro).setFocusable(true);
		getContentPane().add(intro);
		setVisible(true);
		
		//start game after 10 seconds
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				
				getContentPane().remove(intro);
				
				Ocean theGame = new Ocean();
				((Component)theGame).setFocusable(true);
				getContentPane().add(theGame);
				setVisible(true);				
				passScore = theGame.getScore();
				//end game after 20 seconds
				Timer game = new Timer();
				game.schedule(new TimerTask() {
					public void run() {
						getContentPane().remove(theGame);
						
						EndScreen end = new EndScreen(passScore);
						((Component)end).setFocusable(true);
						getContentPane().add(end);
						setVisible(true);
						game.cancel();
					}
				},2000);
				timer.cancel();
			}
		},2000);

		
	}

	public static void main( String args[] ) throws IOException
	{
		Runner run = new Runner();
		Scanner file = new Scanner(new File("src/FinalProjectJpanel/HighScores.dat"));
		ArrayList<Integer> list = new ArrayList<Integer>(); 

		//load current dat file data into array list
		for (int i=0; i<5; i++) {	
			int s = file.nextInt();
			list.add(s);
			//System.out.println(list);
		}
		//modify array list after 30 seconds(game ends)
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				String finalList = "";
				for (int i=0; i<list.size();i++) {
					if(list.get(i) < passScore) {
						list.add(i, passScore);
						list.remove(5);
						//System.out.println(list);
						break;
					}
				}
				
				for (Integer s : list)
				{
					finalList+= s + " ";
				}
				writeUsingFileWriter(finalList);
				timer.cancel();
			}
		},5000);
	}
	
	//method found online
	private static void writeUsingFileWriter(String data) {
        File file = new File("src/FinalProjectJpanel/HighScores.dat");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
