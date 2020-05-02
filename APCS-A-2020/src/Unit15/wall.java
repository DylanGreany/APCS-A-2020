package Unit15;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;

public class wall extends Block {
	public wall(int x, int y, int length, boolean horizontal) {
		super(x, y, 0, 0, Color.BLACK);
		
		if (horizontal == true){
			setWidth(length);
			setHeight(10);
		}
		if (horizontal == false){
			setWidth(10);
			setHeight(length);
		}
	}
}