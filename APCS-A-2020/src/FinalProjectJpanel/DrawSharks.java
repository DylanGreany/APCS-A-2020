package FinalProjectJpanel;

import java.awt.Color;   
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class DrawSharks {
	private ArrayList<Shark>sharks;
	private int max;
	private int kills;
	
	public DrawSharks(int size) {
		sharks = new ArrayList<Shark>(size);
		max = size;
	}
	
	public void addS(Shark s)
	{
		sharks.add(s);
	}
	
	public void removeS(Shark s) {
		sharks.remove(s);
	}
	
	public int getKills() {
		return kills;
	}
	
	public int getSize() {
		return sharks.size(); 
	}
	
	public void makeS(int x, int y, int w, int h) {
			addS(new Shark(x, y, w, h));
			//System.out.println(sharks.size());
	}
	
	public void drawS( Graphics window )
	{
		for(Shark a : sharks) {
			a.draw(window);
		}
	}
	
	public void deadS(int cX, int cY) {
		for(Shark a : sharks) {
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