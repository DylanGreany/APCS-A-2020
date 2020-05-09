package Unit16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class star extends AbstractShape {
	
	public star (int x, int y, int w, int h, Color c) {
		super(x,y,w,h,c);
	}
	
	public void draw(Graphics window){
		int x = getXPos();
		int y = getYPos();
		int w = getWidth();
		int h = getHeight();
		window.setColor(getColor());
		int [] xPoints = {x, x - w, x+w};
		int [] yPoints = {y, y -h, y-h};
		window.fillPolygon(xPoints, yPoints, xPoints.length);
		int [] xPoints2 = {x, x - w, x+w};
		int [] yPoints2 = {y - h - h/2, y -h/2 , y-h/2};
		window.fillPolygon(xPoints2, yPoints2, xPoints.length);
	}
	public void moveAndDraw(Graphics window){
		draw(window); 
	}
}
