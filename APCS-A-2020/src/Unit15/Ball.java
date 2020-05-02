package Unit15;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		this(200, 200);
	}

	//add the other Ball constructors
	
	public Ball(int x, int y) {
		this(x, y, 10, 10);
	}
	
	public Ball(int x, int y, int width, int height) {
		this(x, y, width, height, 3, 1);
	}
	
	public Ball(int x, int y, int w, int h, Color col) {
		this(x, y, w, h, col, 3, 1);
	}
	
	public Ball(int x, int y, int width, int height, int xSpeed, int ySpeed) {
		this(x, y, width, height, Color.BLACK, xSpeed, ySpeed);
	}
	
	public Ball(int x, int y, int w, int h, Color col, int xSpd, int ySpd) {
		super(x, y, w, h, col);
		
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}
   //add the set methods
   public void setXSpeed(int xSpd) {
	   xSpeed = xSpd;
   }
   
   public void setYSpeed(int ySpd) {
	   ySpeed = ySpd;
   }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.WHITE);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
   draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		
		if (other != null) {
			if (super.equals(obj)) {
				return other.getXSpeed() == this.getXSpeed() &&
						other.getYSpeed() == this.getYSpeed();
			}
		}
		
		return false;
	}   
	
	private boolean xRange(Block other) {
		return getX() >= other.getX() && getX() + this.getWidth() <= other.getX() + other.getWidth();
	}
	
	private boolean yRange(Block other) {
		return getY() >= other.getY() && getY() + this.getHeight() <= other.getY() + other.getHeight();
	}
	
	public boolean didCollideLeft(Object obj) {
		Block other = (Block) obj;
		if (other == null) {
			return false;
		}
		return yRange(other) && getX() + getWidth() > other.getX() && getX() <= other.getX() + other.getWidth();
	}
	
	public boolean didCollideRight(Object obj) {
		Block other = (Block) obj;
		if (other == null) {
			return false;
		}
		return yRange(other) && getX() < other.getX() + other.getWidth() && getX() + getWidth() >= other.getX();
	}
	
	public boolean didCollideTop(Object obj) {
		Block other = (Block) obj;
		if (other == null) {
			return false;
		}
		return xRange(other) && other.getY() < getY() + getHeight() && other.getY() + other.getHeight() >= getY();
	}
	
	public boolean didCollideBottom(Object obj) {
		Block other = (Block) obj;
		if (other == null) {
			return false;
		}
		return xRange(other) && other.getY() < getY() + getHeight() && other.getY() + other.getHeight() >= getY();
	}

   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
   //add a toString() method
	public String toString() {
		return super.toString() + "  " + xSpeed + " " + ySpeed;
	}
}