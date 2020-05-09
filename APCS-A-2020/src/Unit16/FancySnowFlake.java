package Unit16;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake class

public class FancySnowFlake extends AbstractShape {
	public FancySnowFlake(int x, int y, int w, int h, Color c, int xspd, int yspd) {
		super(x,y,w,h,c,xspd,yspd);
	}
	
	public void draw(Graphics window) {
		int x = getXPos();
		int y = getYPos();
		int w = getWidth();
		int h = getHeight();
		
		window.setColor(getColor());
		window.drawLine(x+10, y, x -10, y);
		window.drawLine(x, y+10, x, y -10);
		window.drawLine(x+5, y+5, x-5, y -5);
		window.drawLine(x-5, y+5, x+5, y -5);
		
	}
	
	public void moveAndDraw(Graphics window) {
		setYPos(getYPos() + getYSpeed());
		setXPos(getXPos() - getXSpeed());
	    draw(window);  
	}
}



