package StarFighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Ammo ammo;
	private AlienHorde horde;
	private Bullets shots;
	private boolean canShoot = true;
	/* uncomment once you are ready for this part
	 *
	
	*/
	
	private int score;
	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(100,400,50,50,2);
		//alienOne = new Alien(300, 100, 50, 50, 0);
		//alienTwo = new Alien(500, 100, 50, 50, 0);
		//ammo = new Ammo(10,10,2);
		shots = new Bullets();
		
		horde = new AlienHorde(5);
		
		for(int i = 50; i<300; i+=70) {
			horde.makeHordeX(100, i, 60, 60,5);
		}
		 
	
		
		
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		if(keys[4] == true)
		{
			if(canShoot)
			{
				canShoot = false;
				shots.add(new Ammo(ship.getX() + ship.getWidth()/2, ship.getY() + ship.getHeight()/2, 2));
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
						canShoot = true;
						timer.cancel();
					}
				},250);
			}
			
		}
		
		
		//add code to move Ship, Alien, etc.
		ship.draw(graphToBack);
		//alienOne.draw(graphToBack);
		//alienTwo.draw(graphToBack);
		//ammo.draw(graphToBack);
		//ammo.move("UP");
		shots.drawEmAll(graphToBack);
		shots.moveEmAll();
		
		
		horde.drawEmAll(graphToBack);
		if((int)(Math.random()*3) == 1)
			horde.moveEmAll();
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		horde.removeDeadOnes(shots);
		score = horde.getKills();
		
		if(score > 19 || horde.shouldBeDead(ship) == true) {
			graphToBack.setColor(Color.YELLOW);
			graphToBack.setFont(new Font("Serif", Font.BOLD, 50));
			graphToBack.drawString("Game Over!!!", 250, 300);
		}
		graphToBack.setColor(Color.YELLOW);
		graphToBack.setFont(new Font("Serif", Font.BOLD, 25));
		graphToBack.drawString("Score: " + score, 350, 50);
		
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}


	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
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
}

