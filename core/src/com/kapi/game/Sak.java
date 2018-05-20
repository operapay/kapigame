package com.kapi.game;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Sak {
    private Vector2 position;
    public int width;
    public int height;
    public int time = 0;
    private Rectangle rectangle;
    World world;
    
    public Sak(int x, int y) {
    	//this.world = world;
        position = new Vector2(x,y);
        width = 256;
        height = 320;
        rectangle = new Rectangle(x,y,width,height);
    }    
 
    public Vector2 getPosition() {
        return position;    
    }
    
    public Rectangle getRectangle() {
    	return rectangle;
    }
    public void render(float delta) {
    	width = 245;
		height = 310;
    }
    public void render2(float delta) {
    	width = 256;
		height = 320;
    }
}
