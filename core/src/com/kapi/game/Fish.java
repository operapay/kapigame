package com.kapi.game;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Fish {
	private Vector2 position;
    public static int SPEED = 3;
    public static int SPEED2 = 3;
    public static int SPEED0 = 0;
    //private int number = ThreadLocalRandom.current().nextInt(440,770);
    public int width;
    public int height;
    private Rectangle rectangle;
    
    public Fish(int x, int y) {
        position = new Vector2(x,y+20);
        width = 60;
        height = 40;
        rectangle = new Rectangle(x,y,width,height);
    }    
 
    public Vector2 getPosition() {
        return position;    
    }
    
    public Rectangle getRectangle() {
    	return rectangle;
    }
    public void move() { 
        //position.x -= SPEED;
    	position.x -= SPEED;
        rectangle.setPosition(position.x,position.y);
    }
    public void move2() { 
        //position.x -= SPEED2;
    	position.x += SPEED2;
        rectangle.setPosition(position.x,position.y);
    }
    public void stop() {
    	position.x = SPEED0;
    	position.y = SPEED0;
    	rectangle.setPosition(position.x,position.y);
    }
}
