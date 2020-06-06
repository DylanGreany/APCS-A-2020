package FinalProjectJpanel;

import java.io.File;   
import java.io.IOException;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Shark extends Object
{
	private Image image;
	
	public Shark()
	{
		this(0,0,30,30);
	}

	public Shark(int x, int y)
	{
		this(x,y,30,30);
	}

	public Shark(int x, int y, int w, int h)
	{
		super(x, y, w,h);
		try {
			image = ImageIO.read(getClass().getResource("/FinalProjectJpanel/shark.jpg"));
		} catch (IOException e) {
			System.out.println("Couldn't locate image file");
		}
	}
	
	public void draw(Graphics window) {
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null); 
	}

	public String toString()
	{
		return "";
	}
}