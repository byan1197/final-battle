package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.src.main.classes.EntityC;

public class Saadouken extends GameObject implements EntityC{
	
	 Texture tex = Game.getInstance();
	
	private double velX;
	private double x,y;
	private Game game;
	private Controller c;
	
	private Animation saadouken, saadoukenLeft;
	
	public Saadouken (double x, double y, Game game, Controller c, int velX){
		super (x, y);
		this.x = x;
		this.y = y;
		this.game = game;
		this.c = c;
		this.velX = velX;
		
		saadouken = new Animation (5, tex.saadouken[0], tex.saadouken[1], tex.saadouken[2] 
				);
		saadoukenLeft = new Animation (
				5, tex.saadouken[3], tex.saadouken[4], tex.saadouken[5] 				
						);
		
	}
	
	public void tick(){
		x+= velX;
		if (Physics.Collision1(this, game.ea) || Physics.Collision2(this, game.eb)) {
			System.out.println("Player hit");
		}
		saadouken.runAnimation();
		saadoukenLeft.runAnimation();

		
	}
	
	public void render(Graphics g) {
			if (velX < 1){
				saadouken.drawAnimation(g, (int)x, (int)y); 
			}
			else if (velX > 1){
				saadoukenLeft.drawAnimation(g, (int)x, (int)y); 
			}
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public Rectangle getBounds(){
		return new Rectangle ((int)x+10, (int)y,80, 100);
	}
}
