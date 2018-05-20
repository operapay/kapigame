package com.kapi.game;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Bowl {
	private Vector2 position;
    public static int SPEED = 1;
   // private int number = ThreadLocalRandom.current().nextInt(440,770);
    public int width;
    public int height;
    private Rectangle rectangle;
    
    public Bowl(int x, int y) {
        position = new Vector2(x,y);
        width = 140;
        height = 80;
        rectangle = new Rectangle(x,y,width,height);
    }    
 
    public Vector2 getPosition() {
        return position;    
    }
    
    public Rectangle getRectangle() {
    	return rectangle;
    }
}
