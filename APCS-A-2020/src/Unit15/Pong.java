package Unit15;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore, rightScore;
	private wall top, bottom, left, right;


	public Pong()
	{
		//set up all variables related to the game
		rightScore = 0;
		leftScore = 0;
		ball = new SpeedUpBall();
		leftPaddle = new Paddle(10, 10, 10, 100, 4);
		rightPaddle = new Paddle(775, 10, 10, 100, 4);
		top = new wall(0, 0, 820, true);
		bottom = new wall(0, 610, 800 + 20, true);
		left = new wall(0, 10, 600, false);
		right = new wall(810, 10, 600, false);

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		back = (BufferedImage) (createImage(getWidth(), getHeight()));
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		top.draw(graphToBack);
		bottom.draw(graphToBack);
		left.draw(graphToBack);
		right.draw(graphToBack);

		if (ball.didCollideBottom(top) || ball.didCollideTop(bottom)) {
			ball.setYSpeed(-ball.getYSpeed());
		} 
		else if (ball.didCollideTop(leftPaddle) || ball.didCollideBottom(leftPaddle)
				|| ball.didCollideTop(rightPaddle) || ball.didCollideBottom(rightPaddle)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
		if (ball.didCollideLeft(right)) {
			ball.setXSpeed(-ball.getXSpeed());
			rightScore++;
		}
		if (ball.didCollideRight(left)) {
			ball.setXSpeed(-ball.getXSpeed());
			leftScore++;
		} 
		else if (ball.didCollideLeft(leftPaddle) || ball.didCollideRight(leftPaddle)
				|| ball.didCollideLeft(rightPaddle) || ball.didCollideRight(rightPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}


		//see if the paddles need to be moved

		if (keys[0] == true ) {
			leftPaddle.moveUpAndDraw(window);
		}
		if (keys[1] == true ) {
			leftPaddle.moveDownAndDraw(window);
		}

		if (keys[2] == true ) {
			rightPaddle.moveUpAndDraw(window);
		}
		if (keys[3] == true ) {
			rightPaddle.moveDownAndDraw(window);
		}
		twoDGraph.drawImage(back, null, 0, 0);
		twoDGraph.drawString("Leftscore: " + Integer.toString(leftScore), 400, 540);
		twoDGraph.drawString("Rightscore: " + Integer.toString(rightScore), 600, 540);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : 
				keys[0]=false; 
				break;
			case 'Z' : 
				keys[1]=false; 
				break;
			case 'I' : 
				keys[2]=false; 
				break;
			case 'M' : 
				keys[3]=false; 
				break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}