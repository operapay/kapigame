package com.kapi.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
//import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.math.Intersector;
import com.kapi.game.KapiGame;

public class World {
	private KapiGame kapiGame;
	private Ship ship;
	private Hook hook;
	private Bowl bowl;
	private Rope rope;
	private Salt fishtak;
	private Sak sak;
	private Fish fish1;
	private Fish fish2;
	private Fish fish3;
	private Fish fish4;
	private Fish fish5;
	private Fish fishflip1;
	private Fish fishflip2;
	private Fish fishflip3;
	private Fish fishflip4;
	private Fish fishflip5;
	public int gameState = -6;
	boolean hookStatus = false;
	public int time = 0,timesale = 0;
	public int timesun = 0,timelist = 0;
	public int timecheck = 0,timemalaga = 0;
	public int timemalaga1 = 0,timemalaga2 = 0,timemalaga3 = 0;
	public int timewink = 0,timeveg = 0,timelist2 = 0;
	public int timeja = 0,timeja1 = 0,timeja2 = 0;
	public float touchflip5,touchflip4,touchflip3,touchflip2,touchflip1;
	public float touch5,touch4,touch3,touch2,touch1;
	Music subsale,wink,subsale0,list;
    Music lung3,lung2,dek1;
    Music s131,s132,s133,s134,s135;
	
	World(KapiGame kapiGame){
		this.setKapiGame(kapiGame);
		ship = new Ship(450,320);
		sak = new Sak(700,340);
		hook = new Hook(450,320);
		bowl = new Bowl(450,320);
		rope = new Rope(450,320);
		fishtak = new Salt(250,80);
		fish1 = new Fish(1280,300);
		fish2 = new Fish(1250,300);
		fish3 = new Fish(1050,300);
		fish4 = new Fish(1100,300);
		fish5 = new Fish(1180,300);
		fishflip1 = new Fish(0,300);
		fishflip2 = new Fish(100,300);
		fishflip3 = new Fish(50,300);
		fishflip4 = new Fish(20,300);
		fishflip5 = new Fish(0,300);
		list = Gdx.audio.newMusic(Gdx.files.internal("checklist.mp3"));
		subsale0 = Gdx.audio.newMusic(Gdx.files.internal("subsale0.mp3"));
		subsale = Gdx.audio.newMusic(Gdx.files.internal("subsale.mp3"));
        lung2 = Gdx.audio.newMusic(Gdx.files.internal("lung2.mp3"));
        lung3 = Gdx.audio.newMusic(Gdx.files.internal("lung3.mp3"));
        wink = Gdx.audio.newMusic(Gdx.files.internal("wink.mp3"));
        dek1 = Gdx.audio.newMusic(Gdx.files.internal("lung2.5.mp3"));
        s131 = Gdx.audio.newMusic(Gdx.files.internal("13.1.mp3"));
        s132 = Gdx.audio.newMusic(Gdx.files.internal("13.2.mp3"));
        s133 = Gdx.audio.newMusic(Gdx.files.internal("13.3.mp3"));
        s134 = Gdx.audio.newMusic(Gdx.files.internal("13.4.mp3"));
        s135 = Gdx.audio.newMusic(Gdx.files.internal("13.5.mp3"));
	
	}
	public boolean pointOnSalt(int x,int y) {
		return (x>=174 && x<=1138) && (y >=115 && y <= 588);
	}
	public boolean pointOnFish(int x,int y) {
		return (x>=295 && x<=401) && (y >=521 && y <= 598);
	}
	public boolean pointOnSak(int x,int y) {
		return (x>=713 && x<=946) && (y >=66 && y <= 366);
	}
	public boolean pointOnTum(int x,int y) {
		return (x>=713 && x<=946) && (y >=109 && y <= 470);
	}
	public KapiGame getkapiGame() {
		return kapiGame;
	}
	public void setKapiGame(KapiGame kapiGame) {
		this.kapiGame = kapiGame;
	}
	public void update(float delta) {
		if(gameState == -6) {
			timemalaga += 1;
			if(timemalaga > 100 && timemalaga < 150) {
				gameState = -5;
			}
		}
		if(gameState == -5) {
			timemalaga1 += 1;
			if(timemalaga1 > 100 && timemalaga1 < 150) {
				gameState = -4;
			}
		}
		if(gameState == -4) {
			timemalaga2 += 1;
			if(timemalaga2 > 100 && timemalaga2 < 150) {
				gameState = -3;
			}
		}
		if(gameState == -3) {
			timemalaga3 += 1;
			if(timemalaga3 > 150 && timemalaga3 < 200) {
				gameState = -2;
			}
		}
		if(gameState == -2) {
			//subsale.play();
			timelist += 1;
			if(timelist > 50 && timelist < 70) {
				list.play();
			}
			if(timelist > 400) {
				gameState = -1;
			}
		}
		if(gameState == -1) {
			//subsale.play();
			timesale += 1;
			if(timesale > 50 && timesale < 70) {
				subsale0.play();
			}
			if(timesale > 350) {
				subsale.play();
			}
			if(timesale > 650) {
				subsale.pause();
				gameState = 0;
			}
		}
		if(gameState == 1) {
			time += 1;
			if(Intersector.overlaps(hook.getRectangle(),fish1.getRectangle()) && hookStatus == false){	
				hookStatus = true;
				touch1 = 1;	
		    }
			else if(Intersector.overlaps(hook.getRectangle(),fish2.getRectangle()) && hookStatus == false){		
				hookStatus = true;
				touch2 = 1;	
		    }
			else if(Intersector.overlaps(hook.getRectangle(),fish3.getRectangle()) && hookStatus == false){
				hookStatus = true;
				touch3 = 1;	
		    }
			else if(Intersector.overlaps(hook.getRectangle(),fish4.getRectangle()) && hookStatus == false){		
				hookStatus = true;
				touch4 = 1;	
		    }
			else if(Intersector.overlaps(hook.getRectangle(),fish5.getRectangle()) && hookStatus == false){		
				hookStatus = true;
				touch5 = 1;	
		    }
			else if(Intersector.overlaps(hook.getRectangle(),fishflip1.getRectangle()) && hookStatus == false){	
				hookStatus = true;
				touchflip1 = 1;	
		    }
			else if(Intersector.overlaps(hook.getRectangle(),fishflip2.getRectangle()) && hookStatus == false){
				hookStatus = true;
				touchflip2 = 1;	
		    }
			else if(Intersector.overlaps(hook.getRectangle(),fishflip3.getRectangle()) && hookStatus == false){	
				hookStatus = true;
				touchflip3 = 1;	
		    }
			else if(Intersector.overlaps(hook.getRectangle(),fishflip4.getRectangle()) && hookStatus == false){	
				hookStatus = true;
				touchflip4 = 1;
		    }
			else if(Intersector.overlaps(hook.getRectangle(),fishflip5.getRectangle()) && hookStatus == false){
				hookStatus = true;
				touchflip5 = 1;	
		    }
			if(time%300 > 0 && time%300 < 300) {
				fish1.move();
				fishflip3.move2();
				fishflip4.move2();
			}
			if(time%400 > 0 && time%400 < 400) {
				fish4.move();
				fish5.move();
				fishflip2.move2();
			}
			if(time%550 > 0 && time%550 < 550) {
				fishflip1.move2();
				fish2.move();
				fish3.move();
				fishflip5.move2();
			}
		}
		if(gameState == 1) {
			timecheck++;
			if(timecheck > 500 && timecheck < 520) {
				lung2.play();
			}
			if(timecheck > 800 && timecheck < 820) {
				dek1.play();
			}
			if(timecheck > 1000 && timecheck < 1020) {
				lung3.play();
			}
			if(timecheck > 1800) {
				gameState = 2;
			}
		}
		if(gameState == 7) {
			timesun++;
			if(timesun > 270 && timesun < 315) {
				gameState = 8;
			}
		}
		if(gameState == 8) {
			timesun++;
			if(timesun > 340) {
				gameState = 9;
			}
		}
		if(gameState == 15) {
			timewink++;
			if(timewink > 80) {
				wink.play();
				gameState = 16;
			}
		}
		if(gameState == 16) {
			timeveg++;
			if(timeveg > 200) {
				//wink.play();
				gameState = 17;
			}
		}
		if(gameState == 17) {
			timelist2++;
			if(timelist2 > 50 && timelist2 < 70) {
				s131.play();
			}
			if(timelist2 > 170 && timelist2 < 190) {
				s132.play();
			}
			if(timelist2 > 550 && timelist2 < 570) {
				s133.play();
			}
			if(timelist2 > 1200 && timelist2 < 1220) {
				s134.play();
			}
			if(timelist2 > 1500 && timelist2 < 1520) {
				s135.play();
			}
			if(timelist2 > 2000) {
				//wink.play();
				gameState = 18;
			}
			//System.out.println(timelist2);
		}
		if(gameState == 18) {
			timeja += 1;
			if(timeja > 200) {
				gameState = 19;
			}
		}
		if(gameState == 19) {
			timeja1 += 1;
			if(timeja1 > 100) {
				gameState = 20;
			}
		}
		if(gameState == 20) {
			timeja2 += 1;
			if(timeja2 > 100) {
				gameState = 21;
			}
		}
	}
	Ship getShip() {
		return ship;
	}
	Hook getHook() {
		return hook;
	}
	Salt getFishtak() {
		return fishtak;
	}
	Sak getSak() {
		return sak;
	}
	Fish getFish1() {
		return fish1;
	}
	Fish getFish2() {
		return fish2;
	}
	Fish getFish3() {
		return fish3;
	}
	Fish getFish4() {
		return fish4;
	}
	Fish getFish5() {
		return fish5;
	}
	Fish getFishFlip1() {
		return fishflip1;
	}
	Fish getFishFlip2() {
		return fishflip2;
	}
	Fish getFishFlip3() {
		return fishflip3;
	}
	Fish getFishFlip4() {
		return fishflip4;
	}
	Fish getFishFlip5() {
		return fishflip5;
	}
	Rope getRope() {
		return rope;
	}
	Bowl getBowl() {
		return bowl;
	}
}
