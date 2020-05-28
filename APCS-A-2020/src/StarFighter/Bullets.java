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

public class Bullets
{
	private ArrayList<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>(0);
	}

	public void add(Ammo b)
	{
		ammo.add(b);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for(Ammo a : ammo) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for(Ammo a : ammo) {
			a.move("UP");
		}
	}

	public void cleanEmUp(Ammo a)
	{
		ammo.remove(a);
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}
