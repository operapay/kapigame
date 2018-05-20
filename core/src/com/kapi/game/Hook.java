package com.kapi.game;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Hook {
    private Vector2 position;
    public static final int SPEED = 10;
    public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_DOWN = 3;
    public static final int DIRECTION_LEFT = 4;
    //public static final int SPEED2 = 4;
    //private int number = ThreadLocalRandom.current().nextInt(440,770);
    public int width;
    public int height;
    public int time = 0;
    private Rectangle rectangle;
    
    public Hook(int x, int y) {
        position = new Vector2(x+30,y+120);
        width = 61;
        height = 242;
        rectangle = new Rectangle(x,y,width,height);
    }    
 
    public Vector2 getPosition() {
        return position;    
    }
    
    public Rectangle getRectangle() {
    	return rectangle;
    }
    private static final int [][] DIR_OFFSETS = new int [][] {
        {0,0},
        {0,1},
        {1,0},
        {0,-1},
        {-1,0}
    };
    
    public void moveup(int dir) { 
        //position.x += SPEED * DIR_OFFSETS[dir][0];
        position.y += SPEED * DIR_OFFSETS[dir][1];
        rectangle.setPosition(position.x,position.y);
    }
    public void movedown() { 
        //position.x -= SPEED;
    	position.y -= SPEED;
        rectangle.setPosition(position.x,position.y);
    }
}
