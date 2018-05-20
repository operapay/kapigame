package com.kapi.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.Input.Keys;

public class GameScreen extends ScreenAdapter {
    World world;
    WorldRender worldRenderer;
    private KapiGame kapiGame;
    private Ship ship;
    private Hook hook;
    private Sak sak;
    private Salt fishtak;
    public int count = 0;
    Sound flip;
    Sound mash;
	Sound lung1;
	Sound lung2;
	Sound lung3;
    
    public GameScreen(KapiGame kapiGame) {
        this.setKapiGame(kapiGame);
        world = new World(kapiGame);
        worldRenderer = new WorldRender(kapiGame, world);
        ship = world.getShip();
        hook = world.getHook();
        fishtak = world.getFishtak();
        sak = world.getSak();
        flip = Gdx.audio.newSound(Gdx.files.internal("flip.mp3"));
        mash = Gdx.audio.newSound(Gdx.files.internal("mash.mp3"));
        lung1 = Gdx.audio.newSound(Gdx.files.internal("lung1.mp3"));
        lung2 = Gdx.audio.newSound(Gdx.files.internal("lung2.mp3"));
        lung3 = Gdx.audio.newSound(Gdx.files.internal("lung3.mp3"));
    }    
    @Override
    public void render(float delta) {
    	update(delta);
    	worldRenderer.render(delta);
    	//worldRenderer.update(delta);
    	world.update(delta);
    	//System.out.println(Gdx.input.getX() + " " + Gdx.input.getY());
    }
    
    private void update(float delta) {
        if(Gdx.input.isKeyPressed(Keys.LEFT) && (world.gameState == 0 || world.gameState == 1)) {
        	ship.move(Ship.DIRECTION_LEFT);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT) && (world.gameState == 0 || world.gameState == 1)) {
        	ship.move(Ship.DIRECTION_RIGHT);
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN) && world.gameState == 1) {
        	hook.moveup(Hook.DIRECTION_DOWN);
        }
        if(Gdx.input.isKeyPressed(Keys.UP) && world.gameState == 1) {
        	hook.moveup(Hook.DIRECTION_UP);
        	
        }
        if(Gdx.input.isKeyJustPressed(Keys.DOWN) && world.gameState == 0) {
        	lung1.play();
        	world.gameState = 1;
        }
        if(world.pointOnSalt(Gdx.input.getX(),Gdx.input.getY())) {
	        if(Gdx.input.justTouched() && world.gameState == 2) {
	        	flip.play(2f);
	        	world.gameState = 3;
	        }
	        else if(Gdx.input.justTouched() && world.gameState == 3) {
	        	flip.play(2f);
	        	world.gameState = 4;
	        }
	        else if(Gdx.input.justTouched() && world.gameState == 4) {
	        	flip.play(2f);
	        	world.gameState = 5;
	        }
	        else if(Gdx.input.justTouched() && world.gameState == 5) {
	        	flip.play(2f);
	        	world.gameState = 6;
	        }
	        else if(Gdx.input.justTouched() && world.gameState == 6) {
	        	world.gameState = 7;
	        }
        }
        if(world.pointOnFish(Gdx.input.getX(),Gdx.input.getY())) {
        	if(world.gameState == 9) {
        		fishtak.render(delta);
        	}
	        if(Gdx.input.justTouched() && world.gameState == 9) {
	        	world.gameState = 10;
	        }
        }
        else {
        	if(world.gameState == 9) {
        		fishtak.render2(delta);
        	}
        }
        if(world.pointOnSak(Gdx.input.getX(),Gdx.input.getY())) {
        	if(world.gameState == 10 || world.gameState == 12 || world.gameState == 14) {
        		sak.render(delta);
        	}
	        if(Gdx.input.justTouched() && world.gameState == 10) {
	        	mash.play(2f);
	        	world.gameState = 11;
	        }
	        else if(Gdx.input.justTouched() && world.gameState == 12) {
	        	world.gameState = 13;
	        }
	        else if(Gdx.input.justTouched() && world.gameState == 14) {
	        	mash.pause();
	        	world.gameState = 15;
	        }
        }
        else {
        	sak.render2(delta);
        }
        if(world.pointOnTum(Gdx.input.getX(),Gdx.input.getY())) {
        	if(world.gameState == 11 || world.gameState == 13) {
        		sak.render(delta);
        	}
	        if(Gdx.input.justTouched() && world.gameState == 11) {
	        	mash.play();
	        	world.gameState = 12;
	        }
	        else if(Gdx.input.justTouched() && world.gameState == 13) {
	        	world.gameState = 14;
	        }
        }
        else {
        	sak.render2(delta);
        }
    }
	public KapiGame getKapiGame() {
		return kapiGame;
	}
	public void setKapiGame(KapiGame kapiGame) {
		this.kapiGame = kapiGame;
	}
}
