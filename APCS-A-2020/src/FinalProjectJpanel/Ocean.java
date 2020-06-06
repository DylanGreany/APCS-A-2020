package FinalProjectJpanel;

import java.awt.Color; 
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.event.MouseListener;

public class Ocean extends JPanel implements MouseListener, Runnable
{
	private DrawSharks sharks;
	private DrawMinnow fish;
	private Image background;
	private boolean click = false;
	private int clickX,clickY;
	private int score = 8;
	
	public Ocean()  
	{
		setBackground(Color.blue);
		try {
			background = ImageIO.read(getClass().getResource("/FinalProjectJpanel/backgrnd.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		sharks = new DrawSharks(4);
		for(int i = 0; i < 4; i++) {
			int x = (int)((Math.random() * (600-40)));
			int y = (int)((Math.random() * (600-40)));
			sharks.makeS(x, y, 50, 50);
		}
		fish = new DrawMinnow(4);
		for(int i = 0; i < 4; i++) {
			int x = (int)((Math.random() * (600-40)));
			int y = (int)((Math.random() * (600-40)));
			fish.makeS(x, y, 50, 50);
		}
		
	}
	
	
	
	public void update(Graphics window)
	{
		paint(window);
	}
	
	public void paint( Graphics window )
	{
		window.drawImage(background,getX(),getY(),600,600,null); 
		sharks.drawS(window);
		fish.drawS(window);
		
		if(click == true ) {
			sharks.deadS(clickX, clickY);
			fish.deadS(clickX, clickY);
		}
	}

	public void run() {
		try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }catch(Exception e)
	      {
	      }
	}
	
	public void mousePressed(MouseEvent e) {
		click = true;
		clickX = e.getX();
		clickY = e.getY();
	}

	public void mouseReleased(MouseEvent e) {
		click = false;
	}
	
	public void mouseClicked(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
	
	public int getScore() {
		return score;
	}

}