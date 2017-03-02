package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;

import com.game.src.main.classes.EntityD;

public class Shuriken extends GameObject implements EntityD{
	
	Texture tex = Game.getInstance();

	private double velX;
	private double x,y;
	
	private Animation shuriken;
	private Game game;
	private Controller c;
	
	public Shuriken (double x, double y, Game game, Controller c, int velX){
		super (x, y);
		this.x = x;
		this.y = y;
		this.game = game;
		this.c = c;
		this.velX = velX;
		shuriken = new Animation ( 1, tex.bond_shuriken[0], tex.bond_shuriken[1], tex.bond_shuriken[2], tex.bond_shuriken[3]
				);
	}
	
	public void tick(){
		x+= velX;
		shuriken.runAnimation();
		if (Physics.Collision4(this, game.ea) || Physics.Collision3(this, game.eb)) {
			System.out.println("Player hit");
		}
		
	}
	
	public void render(Graphics g) {
		shuriken.drawAnimation(g, (int)x, (int)y + 20);  
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
