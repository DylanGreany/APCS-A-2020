package FinalProjectJpanel;

import java.awt.Color;  
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class DrawMinnow {
	private ArrayList<Minnow>fish;
	private int max;
	private int kills;
	
	public DrawMinnow(int size) {
		fish = new ArrayList<Minnow>(size);
		max = size;
	}
	
	public void addS(Minnow s)
	{
		fish.add(s);
	}
	
	public void removeS(Minnow s) {
		fish.remove(s);
	}
	
	public int getKills() {
		return kills;
	}
	
	public int getSize() {
		return fish.size(); 
	}
	
	public void makeS(int x, int y, int w, int h) {
			addS(new Minnow(x, y, w, h));
			//System.out.println(sharks.size());
	}
	
	public void drawS( Graphics window )
	{
		for(Minnow a : fish) {
			a.draw(window);
		}
	}
	
	public void deadS(int cX, int cY) {
		for(Minnow a : fish) {
			if((cY > a.getY() && cY < a.getY()+a.getHeight()) && (cX > a.getX() && cX < a.getX()+a.getWidth())) {
				removeS(a);
				kills++;
				int x = (int)((Math.random() * (730-40) +40));
				int y = (int)((Math.random() * (530-40) + 40));
				makeS(x, y, 50, 50);
			}
		}
	}
}