package com.kapi.game;

import java.util.concurrent.ThreadLocalRandom;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.kapi.game.KapiGame;
import com.kapi.game.World;

public class WorldRender {
	private World world;
	private KapiGame kapi;
    private Texture shipImg;
    private Texture lastImg;
    private Texture sunImg;
    private Texture subgameImg;
    private Texture sub1Img;
    private Texture sub2Img;
    private Texture sub3Img;
    private Texture sub4Img;
    private Texture sub5Img;
    private Texture sakImg;
    private Texture sun1Img;
    private Texture salt1Img;
    private Texture salt2Img;
    private Texture salt3Img;
    private Texture riverImg;
    private Texture hookImg;
    private Texture bowlImg;
    private Texture bod1Img;
    private Texture bod2Img;
    private Texture bod3Img;
    private Texture bod4Img;
    private Texture bod5Img;
    private Texture ropeImg;
    private Texture fishbodImg;
    private Texture fishtakImg;
    private Texture fish1Img;
    private Texture fish2Img;
    private Texture fish3Img;
    private Texture fish4Img;
    private Texture fish5Img;
    private Texture fishflip1Img;
    private Texture fishflip2Img;
    private Texture fishflip3Img;
    private Texture fishflip4Img;
    private Texture fishflip5Img;
    private Texture saleImg;
    private Texture checklistImg;
    private Texture malagaImg;
    private Texture checklist2Img;
    private Texture vegImg;
    private Texture mintoma1Img;
    private Texture mintoma2Img;
    private Texture mintoma3Img;
    private Texture matoja1Img;
    private Texture matoja2Img;
    private Texture matoja3Img;
    
    public WorldRender(KapiGame kapi, World world) {
    	this.kapi = kapi;
    	this.world = world;
    	
        shipImg = new Texture("ship.png");
        lastImg = new Texture("last.png");
        saleImg = new Texture("sale.png");
        sakImg = new Texture("sak.png");
        sunImg = new Texture("sun.png");
        subgameImg = new Texture("subgame.png");
        sub1Img = new Texture("sub1.png");
        sub2Img = new Texture("sub2.png");
        sub3Img = new Texture("sub3.png");
        sub4Img = new Texture("sub4.png");
        sub5Img = new Texture("sub5.png");
        sun1Img = new Texture("sun2.png");
        salt1Img = new Texture("salt1.png");
        salt2Img = new Texture("salt2.png");
        salt3Img = new Texture("salt3.png");
        riverImg = new Texture("bg.png");
        hookImg = new Texture("hook.png");
        bowlImg = new Texture("bowl.png");
        bod1Img = new Texture("bod1.png");
        bod2Img = new Texture("bod2.png");
        bod3Img = new Texture("bod3.png");
        bod4Img = new Texture("bod4.png");
        bod5Img = new Texture("bod5.png");
        ropeImg = new Texture("rope.png");
        fishbodImg = new Texture("fishping.png");
        fishtakImg = new Texture("fishping.png");
        fish1Img = new Texture("fish.png");
        fish2Img = new Texture("fish.png");
        fish3Img = new Texture("fish.png");
        fish4Img = new Texture("fish.png");
        fish5Img = new Texture("fish.png");
        fishflip1Img = new Texture("fishflip.png");
        fishflip2Img = new Texture("fishflip.png");
        fishflip3Img = new Texture("fishflip.png");
        fishflip4Img = new Texture("fishflip.png");
        fishflip5Img = new Texture("fishflip.png");
        checklistImg = new Texture("checklist.png");
        malagaImg = new Texture("malaga.png");
        checklist2Img = new Texture("checklist2.png");
        vegImg = new Texture("veg.png");
        mintoma1Img = new Texture("map1.1.png");
        mintoma2Img = new Texture("map1.2.png");
        mintoma3Img = new Texture("map1.3.png");
        matoja1Img = new Texture("map2.1.png");
        matoja2Img = new Texture("map2.2.png");
        matoja3Img = new Texture("map2.3.png");
    }
    public void render (float delta) {
        SpriteBatch batch = kapi.batch;
        batch.begin();
        Ship posship = world.getShip();
        Hook poshook = world.getHook();
        Bowl posbowl = world.getBowl();
        Rope posrope = world.getRope();
        Sak possak = world.getSak();
        Salt posfishtak = world.getFishtak();
        Fish posfish1 = world.getFish1();
        Fish posfishflip1 = world.getFishFlip1();
        Fish posfish2 = world.getFish2();
        Fish posfishflip2 = world.getFishFlip2();
        Fish posfish3 = world.getFish3();
        Fish posfishflip3 = world.getFishFlip3();
        Fish posfish4 = world.getFish4();
        Fish posfishflip4 = world.getFishFlip4();
        Fish posfish5 = world.getFish5();
        Fish posfishflip5 = world.getFishFlip5();
        if(posship.getPosition().x<0) {
        	posship.getPosition().x = 0;
        	posship.getPosition().y = 320;
        }
        if(posship.getPosition().x+150 >1050) {
        	posship.getPosition().x = 900;
        	posship.getPosition().y = 320;
        }
        if(poshook.getPosition().y > 220) {
        	poshook.getPosition().y = 220;
        }
        if(poshook.getPosition().y < 0) {
        	poshook.getPosition().y = 0;
        }
        if(posfish1.getPosition().x < 0 || posfish2.getPosition().x < 0 || posfish3.getPosition().x < 0 || 
        	posfish4.getPosition().x < 0 || posfish5.getPosition().x < 0) {
        	posfish1.getPosition().x = 1300;
        	posfish2.getPosition().x = 1250;
        	posfish3.getPosition().x = 1280;
        	posfish4.getPosition().x = 1350;
        	posfish5.getPosition().x = 1400;
        	posfish1.getPosition().y = ThreadLocalRandom.current().nextInt(50,300);
        	posfish2.getPosition().y = ThreadLocalRandom.current().nextInt(50,300);
        	posfish3.getPosition().y = ThreadLocalRandom.current().nextInt(50,300);
        	posfish4.getPosition().y = ThreadLocalRandom.current().nextInt(50,300);
        	posfish5.getPosition().y = ThreadLocalRandom.current().nextInt(50,300);
        	
        }
        if(posfishflip1.getPosition().x > 1280 || posfishflip2.getPosition().x > 1280 || posfishflip3.getPosition().x > 1280 || 
        	posfishflip4.getPosition().x > 1280 || posfishflip5.getPosition().x > 1280) {
        	posfishflip1.getPosition().x = -50;
        	posfishflip2.getPosition().x = 0;
        	posfishflip3.getPosition().x = -100;
        	posfishflip4.getPosition().x = -240;
        	posfishflip5.getPosition().x = -150;
        	posfishflip1.getPosition().y = ThreadLocalRandom.current().nextInt(50,300);
        	posfishflip2.getPosition().y = ThreadLocalRandom.current().nextInt(50,300);
        	posfishflip3.getPosition().y = ThreadLocalRandom.current().nextInt(50,300);
        	posfishflip4.getPosition().y = ThreadLocalRandom.current().nextInt(50,300);
        	posfishflip5.getPosition().y = ThreadLocalRandom.current().nextInt(50,300);
        }
        if(world.gameState == -6) {
        	batch.draw(mintoma1Img,0,0);
        }
        if(world.gameState == -5) {
        	batch.draw(mintoma2Img,0,0);
        }
        if(world.gameState == -4) {
        	batch.draw(mintoma3Img,0,0);
        }
        if(world.gameState == -3) {
        	batch.draw(malagaImg,0,0);
        }
        if(world.gameState == -2) {
        	batch.draw(checklistImg,0,0);
        }
        if(world.gameState == -1) {
        	batch.draw(saleImg,0,0);
        }
        if(world.gameState == 0) {
        	batch.draw(riverImg,0,0);
        	batch.draw(subgameImg,40,0);
        	batch.draw(bowlImg,posship.getPosition().x+250,posship.getPosition().y,posbowl.width,posbowl.height);
	    	batch.draw(shipImg,posship.getPosition().x,posship.getPosition().y,posship.width,posship.height);
        }
        if(world.gameState == 1) {
        	batch.draw(riverImg,0,0);
        	batch.draw(ropeImg,posship.getPosition().x+10,posship.getPosition().y+140,posrope.width,(320-poshook.getPosition().y)*-1);
        	batch.draw(bowlImg,posship.getPosition().x+250,posship.getPosition().y,posbowl.width,posbowl.height);
        	batch.draw(hookImg,posship.getPosition().x,poshook.getPosition().y,poshook.width,poshook.height);
	    	batch.draw(shipImg,posship.getPosition().x,posship.getPosition().y,posship.width,posship.height);
	    	batch.draw(fish1Img,posfish1.getPosition().x-50,posfish1.getPosition().y-80,posfish1.width,posfish1.height);
	    	batch.draw(fish2Img,posfish2.getPosition().x-150,posfish2.getPosition().y-150,posfish2.width,posfish2.height);
	    	batch.draw(fish3Img,posfish3.getPosition().x-140,posfish3.getPosition().y-40,posfish3.width,posfish3.height);
	    	batch.draw(fish4Img,posfish4.getPosition().x-100,posfish4.getPosition().y-100,posfish4.width,posfish4.height);
	    	batch.draw(fish5Img,posfish5.getPosition().x-20,posfish5.getPosition().y-120,posfish5.width,posfish5.height);
	    	batch.draw(fishflip1Img,posfishflip1.getPosition().x-100,posfishflip1.getPosition().y-120,posfishflip1.width,posfishflip1.height);
	    	batch.draw(fishflip2Img,posfishflip2.getPosition().x-70,posfishflip2.getPosition().y-70,posfishflip2.width,posfishflip2.height);
	    	batch.draw(fishflip3Img,posfishflip3.getPosition().x-150,posfishflip3.getPosition().y-90,posfishflip3.width,posfishflip3.height);
	    	batch.draw(fishflip4Img,posfishflip4.getPosition().x-60,posfishflip4.getPosition().y-140,posfishflip4.width,posfishflip4.height);
	    	batch.draw(fishflip5Img,posfishflip5.getPosition().x-80,posfishflip5.getPosition().y-100,posfishflip5.width,posfishflip5.height);
	    	if(world.touchflip5 == 1) {
	    		posfishflip5.getPosition().set(posship.getPosition().x+100,poshook.getPosition().y+220);
	    		if(posfishflip5.getPosition().y > 250) {
	    			posfishflip5.getPosition().set(0,0);
	    			world.touchflip5++;
	    		}
	    	}
	    	if(world.touchflip5 >= 2) {
	    		batch.draw(fishflip5Img,posship.getPosition().x+270,posship.getPosition().y+20,posfishflip5.width,posfishflip5.height);
	    		world.hookStatus = false;
	    	}
	    	if(world.touchflip4 == 1) {
	    		posfishflip4.getPosition().set(posship.getPosition().x+100,poshook.getPosition().y+220);
	    		if(posfishflip4.getPosition().y > 250) {
	    			posfishflip4.getPosition().set(0,0);
	    			world.touchflip4++;
	    		}
	    	}
	    	if(world.touchflip4 >=2) {
	    		batch.draw(fishflip4Img,posship.getPosition().x+280,posship.getPosition().y+20,posfishflip5.width,posfishflip5.height);
	    		world.hookStatus = false;
	    	}
	    	if(world.touchflip3 == 1) {
	    		posfishflip3.getPosition().set(posship.getPosition().x+100,poshook.getPosition().y+220);
	    		if(posfishflip3.getPosition().y > 250) {
	    			posfishflip3.getPosition().set(0,0);
	    			world.touchflip3++;
	    		}
	    	}
	    	if(world.touchflip3 >=2) {
	    		batch.draw(fishflip3Img,posship.getPosition().x+290,posship.getPosition().y+20,posfishflip5.width,posfishflip5.height);
	    		world.hookStatus = false;
	    	}
	    	if(world.touchflip2 == 1) {
	    		posfishflip2.getPosition().set(posship.getPosition().x+100,poshook.getPosition().y+220);
	    		if(posfishflip2.getPosition().y > 250) {
	    			posfishflip2.getPosition().set(0,0);
	    			world.touchflip2++;
	    		}
	    	}
	    	if(world.touchflip2 >= 2) {
	    		batch.draw(fishflip2Img,posship.getPosition().x+290,posship.getPosition().y+30,posfishflip5.width,posfishflip5.height);
	    		world.hookStatus = false;
	    	}
	    	if(world.touchflip1 == 1) {
	    		posfishflip1.getPosition().set(posship.getPosition().x+100,poshook.getPosition().y+220);
	    		if(posfishflip1.getPosition().y > 250) {
	    			posfishflip1.getPosition().set(0,0);
	    			world.touchflip1++;
	    		}
	    	}
	    	if(world.touchflip1 >= 2) {
	    		batch.draw(fishflip1Img,posship.getPosition().x+290,posship.getPosition().y+30,posfishflip5.width,posfishflip5.height);
	    		world.hookStatus = false;
	    	}
	    	if(world.touch5 == 1) {
	    		posfish5.getPosition().set(posship.getPosition().x+100,poshook.getPosition().y+220);
	    		if(posfish5.getPosition().y > 250) {
	    			posfish5.getPosition().set(0,0);
	    			world.touch5++;
	    		}
	    	}
	    	if(world.touch5 >= 2) {
	    		batch.draw(fish5Img,posship.getPosition().x+300,posship.getPosition().y+30,posfishflip5.width,posfishflip5.height);
	    		world.hookStatus = false;
	    	}
	    	if(world.touch4 == 1) {
	    		posfish4.getPosition().set(posship.getPosition().x+100,poshook.getPosition().y+220);
	    		if(posfish4.getPosition().y > 250) {
	    			posfish4.getPosition().set(0,0);
	    			world.touch4++;
	    		}
	    	}
	    	if(world.touch4 >= 2) {
	    		batch.draw(fish4Img,posship.getPosition().x+300,posship.getPosition().y+20,posfishflip5.width,posfishflip5.height);
	    		world.hookStatus = false;
	    	}
	    	if(world.touch3 == 1) {
	    		posfish3.getPosition().set(posship.getPosition().x+100,poshook.getPosition().y+220);
	    		if(posfish3.getPosition().y > 250) {
	    			posfish3.getPosition().set(0,0);
	    			world.touch3++;
	    		}
	    	}
	    	if(world.touch3 >= 2) {
	    		batch.draw(fish3Img,posship.getPosition().x+300,posship.getPosition().y+30,posfishflip5.width,posfishflip5.height);
	    		world.hookStatus = false;
	    	}
	    	if(world.touch2 == 1) {
	    		posfish2.getPosition().set(posship.getPosition().x+100,poshook.getPosition().y+220);
	    		if(posfish2.getPosition().y > 250) {
	    			posfish2.getPosition().set(0,0);
	    			world.touch2++;
	    		}
	    	}
	    	if(world.touch2 >= 2) {
	    		batch.draw(fish2Img,posship.getPosition().x+290,posship.getPosition().y+30,posfishflip5.width,posfishflip5.height);
	    		world.hookStatus = false;
	    	}
	    	if(world.touch1 == 1) {
	    		posfish1.getPosition().set(posship.getPosition().x+100,poshook.getPosition().y+220);
	    		if(posfish1.getPosition().y > 250) {
	    			posfish1.getPosition().set(0,0);
	    			world.touch1++;
	    		}
	    	}
	    	if(world.touch1 >= 2) {
	    		batch.draw(fish1Img,posship.getPosition().x+290,posship.getPosition().y+30,posfishflip5.width,posfishflip5.height);
	    		world.hookStatus = false;
	    	}
        }
        if(world.gameState == 2) {
        	batch.draw(salt1Img,0,0);
        	batch.draw(sub1Img,40,0);
        }
        if(world.gameState == 3 || world.gameState == 5) {
        	batch.draw(salt2Img,0,0);
        }
        if(world.gameState == 4 || world.gameState == 6) {
        	batch.draw(salt3Img,0,0);
        }
        if(world.gameState == 7) {
        	batch.draw(sunImg,0,0);
        	batch.draw(sub2Img,40,300);
        }
        if(world.gameState == 8) {
        	batch.draw(sun1Img,0,0);
        }
        if(world.gameState == 9) {
        	batch.draw(bod1Img,0,0);
        	//batch.draw(fishtakImg,60,80,posfishtak.width,posfishtak.height);
        	batch.draw(fishbodImg,100,50);
        	batch.draw(fishbodImg,50,220);
        	batch.draw(fishtakImg,250,80,posfishtak.width,posfishtak.height);
        	batch.draw(sub3Img,40,0);
        	//batch.draw(fishtakImg,posfishtak.getPosition().x,posfishtak.getPosition().y,posfishtak.width,posfishtak.height);
        }
        if(world.gameState == 10) {
        	batch.draw(bod2Img,0,0);
        	batch.draw(fishbodImg,100,50);
        	batch.draw(fishbodImg,50,220);
        	batch.draw(sakImg,700,340,possak.width,possak.height);
        	batch.draw(sub3Img,40,0);
        }
        if(world.gameState == 11) {
        	batch.draw(bod3Img,0,0);
        	batch.draw(fishbodImg,100,50);
        	batch.draw(fishbodImg,50,220);
        	batch.draw(sakImg,700,300,possak.width,possak.height);
        }
        if(world.gameState == 12) {
        	batch.draw(bod3Img,0,0);
        	batch.draw(fishbodImg,100,50);
        	batch.draw(fishbodImg,50,220);
        	batch.draw(sakImg,700,300,possak.width,possak.height);
        }
        if(world.gameState == 13) {
        	batch.draw(bod4Img,0,0);
        	batch.draw(fishbodImg,100,50);
        	batch.draw(fishbodImg,50,220);
        	batch.draw(sakImg,700,300,possak.width,possak.height);
        }
        if(world.gameState == 14) {
        	batch.draw(bod4Img,0,0);
        	batch.draw(fishbodImg,100,50);
        	batch.draw(fishbodImg,50,220);
        	batch.draw(sakImg,700,340,possak.width,possak.height);
        }
        if(world.gameState == 15) {
        	batch.draw(bod5Img,0,0);
        	batch.draw(fishbodImg,100,50);
        	batch.draw(fishbodImg,50,220);
        	batch.draw(sub4Img,40,0);
        }
        if(world.gameState == 16) {
        	batch.draw(lastImg,0,0);
        	batch.draw(sub5Img,40,0);
        }
        if(world.gameState == 17) {
        	batch.draw(vegImg,0,0);
        	//batch.draw(sub5Img,40,0);
        }
        if(world.gameState == 18) {
        	batch.draw(checklist2Img,0,0);
        	//batch.draw(sub5Img,40,0);
        }
        if(world.gameState == 19) {
        	batch.draw(matoja1Img,0,0);
        }
        if(world.gameState == 20) {
        	batch.draw(matoja2Img,0,0);
        }
        if(world.gameState == 21) {
        	batch.draw(matoja3Img,0,0);
        }
        batch.end();
	}
}
