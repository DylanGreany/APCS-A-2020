package FinalProjectJpanel;

import java.awt.Color; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class EndScreen extends JPanel implements Runnable
{
	private Image intro;
	private int finalScore;
	
	public EndScreen(int score) 
	{
		finalScore = score;
		try {
			intro = ImageIO.read(getClass().getResource("/FinalProjectJpanel/intropic.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	
	public void update(Graphics window)
	{
		paint(window);
	}
	
	public void paint( Graphics window )
	{
		Color c = new Color(173, 216, 230);
		window.setColor(c);
		window.fillRect(0,0,600,600);
		window.setColor(Color.WHITE);
		window.setFont(new Font("Serif", Font.BOLD, 25));
		window.drawString("Game Over", 100, 100);
		window.drawString("Score: "+ finalScore, 100, 150);
		window.drawImage(intro, 200, 300, 200, 200, null);
	}
	
	public void run() {
		
	}
	
}