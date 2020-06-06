package StarFighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;  
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private ArrayList<Alien> aliens;
	private int maxSize;
	private int kills;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
		maxSize = size;
	}

	public void addAlien(Alien al)
	{
		aliens.add(al);
	}
	
	public void removeAlien(Alien hi) {
		aliens.remove(hi);
	}
	
	public int getKills() {
		return kills;
	}

	public void makeHordeX(int x, int y, int w, int h, int s) {
		int gapX = 0;
		for (int i = 0; i < maxSize; i++) {
			addAlien(new Alien(x+gapX, y, w, h, s));
			gapX+=100;
		}
	}
	
	
	public void drawEmAll( Graphics window )
	{
		for(Alien a : aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		if(aliens.size() > 0) {
			String direction = "";
			int dir = (int)(Math.random()*3)+1;
			if(dir==1)
				direction = "RIGHT";
			if(dir==2)
				direction = "LEFT";
			if(dir==3)
				direction = "DOWN";
			int al = (int)(Math.random()*aliens.size());
			aliens.get(al).move(direction);
		}
	}

	public void removeDeadOnes(Bullets shots)
	{
		if (shots.getList().size() > 0) {
			for(int b = 0; b < shots.getList().size(); b++) {
				for(Alien a : aliens) {
					if(shots.getList().get(b).hit(a) == true) {
						removeAlien(a);
						shots.cleanEmUp(shots.getList().get(b));
						kills++;
						break;
					}
				}
			}
		}
	}
	
	public boolean shouldBeDead(Ship ship) {
		for(int i=0; i<aliens.size(); i++) {
			if (ship.hit(aliens.get(i))) {
				return true;
			}
		}
		return false;
	}

	public String toString()
	{
		return "";
	}
}
