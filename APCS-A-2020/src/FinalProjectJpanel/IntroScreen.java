package FinalProjectJpanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class IntroScreen extends JPanel implements Runnable
{
	private Image intro;
	public IntroScreen() 
	{
		try {
			intro = ImageIO.read(getClass().getResource("/FinalProjectJpanel/intropic.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
		window.drawString("Sharks and Minnows Whackamole by Dylan Greany", 100, 50);
		window.setFont(new Font("Serif", Font.BOLD, 15));
		window.drawString("Click Sharks as quickly as possible for 20 seconds", 100, 100);
		window.drawImage(intro, 200, 300, 200, 200, null);

	}
	
	public void run() {
		
	}
	
}